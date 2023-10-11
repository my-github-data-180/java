import java.util.*;
public class Drive_cost {
      double Miles_day;
      double Costgas_per_gal;
      double  Avg_mile_gal;
      double  Park_fee;
      double  toll_per_day;
      
    public Drive_cost() {
    	
    	this(0,0,0,0,0);
    }
      	
	public Drive_cost(double miles_day, double cost_gas_gal, double avg_mile_gal, double park_fee, double toll_day) {
		super();
		Miles_day = miles_day;
		Costgas_per_gal = cost_gas_gal;
		Avg_mile_gal = avg_mile_gal;
		Park_fee = park_fee;
		toll_per_day = toll_day;
	}

	public void acceptDetails() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the details:");
		System.out.println("Miles driven per day:");
		this.Miles_day=sc.nextDouble();
		System.out.println("Cost per gallon of gassoline:");
		this.Costgas_per_gal=sc.nextDouble();
		System.out.println("Miles per gallon:");
		this.Avg_mile_gal=sc.nextDouble();
		System.out.println("Parking fees per day:");
		this.Park_fee=sc.nextDouble();
		System.out.println("Tolls per day:");
		this.toll_per_day=sc.nextDouble();
		   	
	}
	
	public void displayDrivingcost() {
		double Drive_cost=((this.Miles_day/this.Avg_mile_gal)*this.Costgas_per_gal)+this.Park_fee+this.toll_per_day;
		System.out.println("Driving cost per day :"+Drive_cost);
	}


	public static void main(String[] args) {
		
		Drive_cost D = new Drive_cost();
		D.acceptDetails();
		D.displayDrivingcost();
	}

}
