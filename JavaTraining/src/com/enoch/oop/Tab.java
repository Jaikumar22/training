package com.enoch.oop;

public interface Tab {
	void print();
}
class A6 implements Tab{
	public void print(){
		System.out.println("Hello");
		}  
	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
	}
}