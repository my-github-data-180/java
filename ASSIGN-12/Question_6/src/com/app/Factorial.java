package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the number to get factorial of it");
		int fact= sc.nextInt();
		Stream<Integer> strm1 = Stream.iterate(1, i->i+1).limit(fact);
		 Integer result = strm1.reduce(1, (a,e)->a*e);
		System.out.println(result);
		

		                          

	}

}