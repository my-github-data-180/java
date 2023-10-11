package com.app.point;
import java.util.Scanner;
import  com.app.tester_point.*;
public class Point {
	int x_axis;
	int y_axis;

	
public 	Point() {
	this(0,0);
	
}

public Point(int x_axis, int y_axis) {
	super();
	this.x_axis = x_axis;
	this.y_axis = y_axis;

}
 Scanner sc =new Scanner(System.in);

public void acceptPoint() {
	System.out.println("enter point co-orddinates :");
    this.x_axis=sc.nextInt();
    this.y_axis=sc.nextInt();
}

public void getpointDetails() {
	System.out.println("Point="+getDetails());
   
}

public void calculteDistance(Point p) {
	if(inEqual(p))
		System.out.println("Points have same co-ordinates");
		
	else {
	double a=Math.pow((this.x_axis- p.x_axis),2);
	double b=Math.pow((this.y_axis- p.y_axis),2);
	double D=Math.sqrt((a+b));
	System.out.println("Distance="+D);
	}
	
}


public String getDetails() {
	return "("+x_axis+","+y_axis+")";
	
}

public boolean inEqual(Point p) {
	if((this.x_axis==p.x_axis) && (this.y_axis==p.y_axis)){
		
		return true;
	}
	else
	 return false;
	}
	
	
	
}

