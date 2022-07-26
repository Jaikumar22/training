package com.enoch.oop;

public abstract class Bike {
	void run(){
		System.out.println("running");}  
	}  
	class Splendor extends Bike{  
	  void run(){
		  System.out.println("running safely with 60km");}  
	}
	  class honda extends Bike{
		  void run() {
			  System.out.println("RUnning good");
		  }
		  
	  public static void main(String args[]){  
	    Bike b = new Splendor();
	    Bike c = new honda();
	    b.run();  
	    c.run();
	  }  
	  
}
