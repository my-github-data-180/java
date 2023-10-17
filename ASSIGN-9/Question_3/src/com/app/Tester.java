package com.app;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {

         Student[] arr =new Student[5];
         arr[0]= new Student(101,"anand","karad",50);
         arr[1]= new Student(102,"vinay","pune",60);
         arr[2]= new Student(103,"ajay","kolapur",80);
         arr[3]= new Student(104,"anand","kolapur",80);
         arr[4]= new Student(105,"rakesh","vita",90);
		
         for (Student s:arr)
         System.out.println(s.toString());
         System.out.println();
         System.out.println();
         Studentcomp c =new Studentcomp();
         
         Arrays.sort(arr,c);
         for(Student m:arr)
         System.out.println(m);
		
	}

}
