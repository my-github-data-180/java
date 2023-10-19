package com.app;
import java.util.Scanner;

public class Students {
	private int Rollno;
	private String Name;
	private double Marks;

	public Students() {

	}

	public Students(int rollno, String name, double marks) {
		super();
		Rollno = rollno;
		Name = name;
		Marks = marks;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMarks() {
		return Marks;
	}

	public void setMarks(double marks) {
		Marks = marks;
	}
	
	public void acceptData() {
        Scanner sc =new Scanner (System.in);
		System.out.println("Enter students details:");
		System.out.println("Rollno :");
		this.Rollno=sc.nextInt();
		System.out.println("Name :");
		this.Name=sc.next();
		System.out.println("Marks :");
		this.Marks=sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "Students [Rollno=" + Rollno + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	
	
}
