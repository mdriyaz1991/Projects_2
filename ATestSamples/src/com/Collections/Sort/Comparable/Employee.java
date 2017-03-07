package com.Collections.Sort.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>  {
	
	int Id;
	String Name;
	String Location;
	
	public Employee(int Id,String Name, String Location){
		this.Id = Id;
		this.Name = Name;
		this.Location = Location;
	}
	
	public static void main(String args[]){
		
		List<Employee> emplst = new ArrayList<Employee>();
		
		emplst.add(new Employee(4, "Ahuja", "Bangalore"));
		emplst.add(new Employee(2, "Rahul", "Chennai"));
		emplst.add(new Employee(1, "Bavya", "Bangalore"));
		emplst.add(new Employee(3, "Mahesh", "Delhi"));
		
		System.out.println("Array List Befor Sorting : ");
		System.out.println(emplst);
		
		System.out.println();
		System.out.println("Array List After Sorting : ");
		Collections.sort(emplst);     // Sort method can be applied only to List not to Set
//		System.out.println(emplst);
		for(Employee e : emplst){
			System.out.println(e);	
		}
	}


	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		
//		if(Id == emp.Id ){
//			return 0;
//		}
//		else if (Id < emp.Id){
//			return -1;
//		}
//		else{
//			return 1;
//		}
		
		int res;
		res = Name.compareTo(emp.Name);
		return res;
		
		
		
	}
	
	public String toString(){
		return "ID: "+Id +", Name: "+Name +", Location: "+Location;
	}

}
