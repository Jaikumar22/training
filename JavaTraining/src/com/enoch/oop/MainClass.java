package com.enoch.oop;

public class MainClass {
	String Name;
	int age;
	String address;
	int mobile_number;
	
	public MainClass(String Name,int age,String address,int mobileNO) {
		this.Name= Name;
		this.age = age;
		this.address= address;
		this.mobile_number= mobileNO;
		}
	public void displayDetails() {
		System.out.println("JaiPerson Details  : " + Name +"\t"+ age +"\t"+ address +"\t"+ mobile_number);
		System.out.println("arunPerson Details : " + Name +"\t"+ age +"\t"+ address +"\t"+ mobile_number);
		
		
		
	}

public static void main(String[] args) {
	MainClass jaiperson = new MainClass("jai",20,"abc",123456);
	MainClass arunperson = new MainClass("arun", 15, "xyz",54987);
	jaiperson.displayDetails();
	arunperson.displayDetails();
}
}


