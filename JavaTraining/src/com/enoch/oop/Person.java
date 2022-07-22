package com.enoch.oop;


public class Person {

		String name;
		
		int age;
		
		String address;
		
		int mobile;
		
		public static void main(String[] args) {
			
			Person unknownPerson1 = new Person();
			unknownPerson1.name="jai";
			unknownPerson1.address="abc";
			unknownPerson1.age=20;
			
			Person unknownPerson2 = new Person();
			unknownPerson2.name= "jk";
			unknownPerson2.address="dfg";
			unknownPerson2.age=30;
			String s1 = "name of the person1:"+unknownPerson1.name + "\t\t"+ "name of the person2:" + unknownPerson2.name;
			
			System.out.println( s1 );
			
		}
}
