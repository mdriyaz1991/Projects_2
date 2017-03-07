package com.Collections.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort{
	
	public static void main(String args[]){
	
	List<String> al = Arrays.asList("Akash","Ram","Aravind","Zakir","Balaji","Sam","Arjun");
	
	System.out.println("Array List Befor Sorting : ");
	System.out.println(al);
	
	System.out.println();
	System.out.println("Array List After Sorting : ");
	Collections.sort(al);     // Sort method can be applied only to List not to Set
	System.out.println(al);
	
	System.out.println();
	System.out.println("Array List After Reversing: ");
	Collections.reverse(al);  // Before doing Reverse you should sort your list
	System.out.println(al);
	}


	
	

}
