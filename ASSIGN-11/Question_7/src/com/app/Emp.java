package com.app;

public interface Emp {
	double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp[] arr) {
		double Total = 0.0;
		for (Emp e : arr)
			Total += e.getSal() + e.calcIncentives();
		return Total;

	}

}
