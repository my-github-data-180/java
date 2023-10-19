package com.app;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.NavigableSet;



public class Main {

	public static void main(String[] args) {
		Bookcomparator bookcomp =new Bookcomparator();
		
	TreeSet<Books> book =new TreeSet<Books>(bookcomp);
		Books b1 =new Books("kil",1000,"amish",1);
		Books b2 =new Books("cde",2000,"amish",2);
		Books b3 =new Books("cde",4000,"sampath",3);
		Books b4 =new Books("mnn",3000,"vikram",4);
		Books b5 =new Books("fwe",5000,"vasudeva",1);
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		
		
        Iterator<Books> itr =book.iterator();
        while(itr.hasNext()) {
        	Books b= itr.next();
        	System.out.println(b);
        }
		System.out.println();
		
        Iterator<Books> str = book.descendingIterator();
        while(str.hasNext()) {
        	System.out.println(str.next());
        }
        
		
        
	}

}
