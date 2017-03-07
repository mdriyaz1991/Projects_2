package com.Collections;

import java.util.ArrayList;

public class CollectionMethods {
	public static void main(String[] args) {

		CollectionMethods colmethod = new CollectionMethods();
		// create an empty array list
		ArrayList<String> color_list = new ArrayList<String>();

		// use add() method to add values in the list
		color_list.add("White");
		color_list.add("Black");
		color_list.add("Red");

		// create an empty array sample with an initial capacity
		ArrayList<String> sample = new ArrayList<String>();

		// use add() method to add values in the list
		sample.add("Green");
		sample.add("Red");
		sample.add("White");

		System.out.println();
		System.out.println("First List :" + color_list);
		System.out.println("Second List :" + sample);

//		colmethod.methodAddAll(color_list, sample);			// Union of two or more list/set
//		 colmethod.methodRetainAll(color_list,sample);	// Intersection of two or more list/set
		 colmethod.methodContainsAll(color_list,sample);
//		 colmethod.methodremoveAll(color_list,sample);

	}

	private void methodAddAll(ArrayList<String> color_list, ArrayList<String> sample) {
		sample.addAll(color_list);
		System.out.println();
		System.out.println("------------- * AddAll Method *----------------------");
		System.out.println("After applying the method, First List :" + color_list);
		System.out.println("After applying the method, Second List :" + sample);

	}

	private void methodremoveAll(ArrayList<String> color_list, ArrayList<String> sample) {
		sample.removeAll(color_list);
		System.out.println();
		System.out.println("------------- * RemoveAll Method *----------------------");
		System.out.println("After applying the method, First List :" + color_list);
		System.out.println("After applying the method, Second List :" + sample);

	}

	private void methodContainsAll(ArrayList<String> color_list, ArrayList<String> sample) {
		sample.containsAll(color_list);
		System.out.println();
		System.out.println("------------- * ContainsAll Method *----------------------");
		System.out.println("After applying the method, First List :" + color_list);
		System.out.println("After applying the method, Second List :" + sample);

	}

	private void methodRetainAll(ArrayList<String> color_list, ArrayList<String> sample) {

		sample.retainAll(color_list);
		System.out.println();
		System.out.println("------------- * RetainAll Method *----------------------");
		System.out.println("After applying the method, First List :" + color_list);
		System.out.println("After applying the method, Second List :" + sample);
	}

}
