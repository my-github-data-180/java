package com.app.tester;
import com.app.geometry.Point;
import java.util.Scanner;
public class TestpointArray1 {
	
	int Count_point;  //number points to plot
    int choice;
    
    Scanner sc = new Scanner(System.in);
	
    public void countPoints() {
    	
    	System.out.println("enter number of points you want");
		int n=sc.nextInt();
		
         System.out.println("enter the points of co-ordinates");
		Point [] points = new Point[n];
        for(int i=0;i<n;i++)
        {
        	points[i]=new Point();
        	points[i].acceptPoint();
        }
		
        
    do
	{
    	System.out.println("1.DISPLAY THE DETAILS OF SPECIFIC POINT");
    	System.out.println("2.DISPLAY X,Y CO-ORDINATES OF ALL POINTS");
    	System.out.println("3.DISPLAY THE DISTANCE BETWEEN ENTERED POINTS (ENTER INDICES)");
    	System.out.println("4.EXIT");
    	choice=sc.nextInt();
    	
		switch(choice)
		
		{
		
		case 1:
		System.out.println("Enter index (ex:0,1,2.....)of point ");
		int index=sc.nextInt();
		points[index].getpointDetails();
		break;
		
		
		case 2:			
		for( Point p:points)
		p.getpointDetails();
        break;	
        	
		case 3:
			
		System.out.println("enter point's two  indices for clculate distance");
		int m=sc.nextInt();
		int r=sc.nextInt();
		points[m].calculteDistance(points[m], points[r]);
		break;
		
		}	    		
		}while(choice!=4);
}
}