package com.app;

import java.util.stream.IntStream;

public class IntStr {

	public static void main(String[] args) {
		IntStream str =IntStream.range(1,10);
		Integer sum =str.sum();
		System.out.println(sum);
		IntStream str2 =IntStream.range(1,20);
		System.out.println(str2.summaryStatistics());

	}

}
