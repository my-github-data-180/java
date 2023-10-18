package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stringlength {

	public static void main(String[] args) {
	List<String> str =new ArrayList<String>();
	
	str.add("naveen");
	str.add("achwarggennegar");
	str.add("abhishek");
	str.add("rohit");
	str.add("ashish");
	str.add("manoj");
	
	Stringcomparator sc =new Stringcomparator();
	String maxS =Collections.max(str,sc);
	System.out.println(maxS);

	}

}
