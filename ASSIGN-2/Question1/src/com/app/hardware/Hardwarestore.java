package com.app.hardware;

import java.util.Scanner;

public class Hardwarestore {

	String P_number;
	String P_descpt;
	int P_quantity;
	double Price;

	Scanner sc = new Scanner(System.in);

	public Hardwarestore() {
		this("", "*", 0, 0);
	}

	public Hardwarestore(String part_nuumber, String part_descpt, int part_quantity, double price) {
		super();
		P_number = part_nuumber;
		P_descpt = part_descpt;
		P_quantity = part_quantity;
		Price = price;
	}

	public String getP_number() {
		return P_number;
	}

	public void setP_number(String p_number) {
		P_number = p_number;
	}

	public String getP_descpt() {
		return P_descpt;
	}

	public void setP_descpt(String p_descpt) {
		P_descpt = p_descpt;
	}

	public int getP_quantity() {
		return P_quantity;
	}

	public void setP_quantity(int p_quantity) {
		P_quantity = p_quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public void acceptHardware() {
       	 System.out.println("enter part number");
       	 P_number=sc.next();
       	 System.out.println("enter part description");
       	 P_descpt=sc.next();
       	 System.out.println("enter part quantinty");
       	 P_quantity=sc.nextInt();
       	 if(P_quantity<0)
       		setP_quantity(0);
       	 else
       	 System.out.println("enter part price");
       	 Price=sc.nextDouble();
         if(Price>0)
         setPrice(0);
        
       }

	public void displayHardware() {
        
	System.out.println("invoice amount =" + this.Price * this.P_quantity);
	}

}
