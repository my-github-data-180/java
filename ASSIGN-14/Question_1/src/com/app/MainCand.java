package com.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainCand {
	public static void main(String []args) throws SQLException {
		
		//opearte one by one making other operation as comment
	try(CandidateDao dao=new CandidateDao()){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Candidate details:");
		System.out.println("Name :");
		String name =sc.next();
		System.out.println("Party :");
		String party=sc.next();
		System.out.println("Voters :");
		int voters =sc.nextInt();
		Candidate c=new Candidate(0,name,party,voters);
		int cnt=dao.save(c);
		System.out.println("Row added :"+cnt);
		
	}
	
	try(CandidateDao dao=new CandidateDao()){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter candidates id to whom info to be updated");
		int id=sc.nextInt();
		System.out.println("Enter name :");
		String nam=sc.next();
		System.out.println("Enter party");
		String part=sc.next();
		Candidate c=new Candidate(id,nam,part,0);
		int cnth=dao.update(c);
		System.out.println("Row added"+cnth);
	}
	
	
	try(CandidateDao dao =new CandidateDao()){
		List<PartyVotes>list=dao.getpartyWisevotes();
		list.forEach(c->System.out.println(c));
		
		
		
	}
	
	}
     
	}	   

