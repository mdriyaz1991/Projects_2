package com.Collections;

import java.util.*;

public class IteratorDemo {

	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		String str = "Ajay";
		System.out.println("Before Remove : ");
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			if (str.equals(itr.next())) {
				itr.remove();
			}
			
		}
		System.out.println("After Remove : ");
		System.out.println(al);

		// String removeElem = "Perl";
		// List<String> myList = new ArrayList<String>();
		// myList.add("Java");
		// myList.add("Unix");
		// myList.add("Oracle");
		// myList.add("C++");
		// myList.add("Perl");
		// System.out.println("Before remove:");
		// System.out.println(myList);
		// Iterator<String> itr = myList.iterator();
		// while (itr.hasNext()) {
		// if (removeElem.equals(itr.next())) {
		// itr.remove();
		// }
		// }
		// System.out.println("After remove:");
		// System.out.println(myList);

		// System.out.println(myList);    
	}
}
