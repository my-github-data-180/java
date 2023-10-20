package com.app;

public class Labour implements Emp {
  private int Hours;
  private int Rate;
  
  
public Labour(int hours, int rate) {
	super();
	Hours = hours;
	Rate = rate;
}

  public double calcIncentives() { 
	if(Hours>300)
		return.05*Hours*Rate;
	else 
		return 0.0;
  }

public int getHours() {
	return Hours;
}


public void setHours(int hours) {
	Hours = hours;
}


public int getRate() {
	return Rate;
}

public void setRate(int rate) {
	Rate = rate;
}


@Override
public String toString() {
	return "Labour [Hours=" + Hours + ", Rate=" + Rate + "]";
}

@Override
public double getSal() {
	
	return this.Hours*this.Rate;
}

  
  
}
