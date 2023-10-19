package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection_class {

	
	public static void main(String []args) {
		
		
//	  Collection<String> c = new ArrayList<>();
//	  Collection<String> c = new HashSet<>();
//	  Collection<String> c = new LinkedHashSet<>();
	Collection<String> c = new TreeSet<>();
	c.add("B");
	c.add("D");
	c.add("A");
	c.add("C");
	c.add("C");
//	c.add(null);
//	c.add(null);
//	c.add(null);
	System.out.println(c.toString());
}	
}
//Arraylist allows multiple null and duplicates also
// HashSet allows only one null value And duplicates are not allowed And set is arrenged on hashcode values(if null exist single null at intial)
//LinkedHashSet allows only one null and No duplicates  and arrenged in insertion order(even the null place)
//TreeSet not allows duplicates and null values(throws NullPointerException) and arrenges values in natural ordering(alphbatical order)




