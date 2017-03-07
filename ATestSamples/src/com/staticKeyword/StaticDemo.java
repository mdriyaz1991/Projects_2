package com.staticKeyword;

public class StaticDemo {
	
	int id;
	String name;
	static String collegeName = "ITIS";
	
	public StaticDemo(int id,String name){
		this.id= id;
		this.name= name;
	}
	public void display(){
		System.out.println(" ID : "+id+" Name : "+this.name+" College : "+this.collegeName);
	}
	
	static void change(){
		collegeName = "BTIS";
	}
    public static void main(String[] args){
    	
    	
    	StaticDemo sd = new StaticDemo(1,"RAM");
    	StaticDemo sd2 = new StaticDemo(2,"SAM");
    	change();
    	sd.display();
    	sd2.display();
    	
    	
    	
    }

}
