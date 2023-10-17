package com.app;

import java.util.Comparator;
import java.util.Iterator;

public class Select_sort {

	public static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		class Selectcomparator implements Comparator<Number> {
			@Override
			public int compare(Number arg0, Number arg1) {
				if (arg0.doubleValue() > arg1.doubleValue())
					return 1;
				return 0;

			}
		}

		Selectcomparator obj = new Selectcomparator();

		Double[] arr1 = { 12.52, 25.55, 8.36, 85.55 };

		for (Double d : arr1)
			System.out.println("Before sort:" + d);
         System.out.println(); // new line
		selectionSort(arr1, obj);
		for (Double c : arr1)
		System.out.println("After sort :" + c);

	}
}
