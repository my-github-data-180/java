package com.app;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainU {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1.To create table (ONLY ONCE)");
			System.out.println("2.Insert data into table");
			System.out.println("3.To display(using select )table");
			System.out.println("4.To upadte the table");
			System.out.println("5.To delete from table");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				try(UserDao dao=new UserDao()){
					int cnt=dao.createtable();
					System.out.println("table created"+cnt);	
				}
				catch(Exception e) {
					e.printStackTrace();
				
				}
				
				break;
				
				
			case 2:
				try(UserDao dao=new UserDao()){
				
				System.out.println("Enter the users details");
				System.out.println("first name :");
				String f=sc.next();
				System.out.println("last name :");
				String l=sc.next();
				System.out.println("email :");
				String email=sc.next();
				System.out.println("password :");
				String pw=sc.next();
				System.out.println("date of birth(dd-mm-yyyy) :");
				String dob1=sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date dob = sdf.parse(dob1);
				Users u =new Users(f,l,email,pw,dob);
				int cnt=dao.addtoTable(u);
				System.out.println("row added"+cnt);
				
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
				
				
			case 3:
				try(UserDao dao =new UserDao()){
					List<Users> list = dao.readfromTable();
					list.forEach(c ->System.out.println(c)); 
//					System.out.printf("%d,%s,%s,%s,%s,true,%td%tm%ty,%s",)//m is  just argument
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
				
			
			case 4:
				try(UserDao dao =new UserDao()){
					System.out.println("Enter the id to which row is to be upadte ");
					int id =sc.nextInt();
					System.out.println("Enter email :");
					String email=sc.next();
					System.out.println("Enetr pawssword");
					String pawword =sc.next();
					Users u =new Users(id ,null,null,email,pawword,null,true,null);
					int cnt =dao.updateTable(u);
					System.out.println("row updated"+cnt);
				}
				catch(Exception e) {
					e.printStackTrace();
				
				}
				
			     break;
			     
			     
			     
			case 5:
				try(UserDao dao =new UserDao()){
					System.out.println("Enter the id of row to be deleted");
					int id=sc.nextInt();
					int cnt=dao.deleteByid(id);
					System.out.println("Row deleted :"+cnt);
					
				}
			}

			
			
		}while(choice!=0);

	}

}
