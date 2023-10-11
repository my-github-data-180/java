package com.app.geometry;

import java.util.Scanner;
import  com.app.tester.Tester;
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

public void calculteDistance(Point p1,Point p2) {
	if(inEqual(p1,p2))
		System.out.println("Points have same co-ordinates");
		
	else {
	double a=Math.pow((p1.x_axis- p2.x_axis),2);
	double b=Math.pow((p1.y_axis- p2.y_axis),2);
	double D=Math.sqrt((a+b));
	System.out.println("Distance b/w specific points ="+D);
	}
	
}



public String getDetails() {
	return "("+x_axis+","+y_axis+")";
	
}

public boolean inEqual(Point p1,Point p2) {				//Point p1,
	if((p1.x_axis==p2.x_axis) && (p1.y_axis==p2.y_axis)){
		
		return true;
	}
	else
	 return false;
	}





public int getX_axis() {
	return x_axis;
}

public void setX_axis(int x_axis) {
	this.x_axis = x_axis;
}

public int getY_axis() {
	return y_axis;
}

public void setY_axis(int y_axis) {
	this.y_axis = y_axis;
}
	
	
	
}