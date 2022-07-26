package com.enoch.oop;

public class HIE {
		void eat() {
			System.out.println("Playing");
		}}
		class Dog extends HIE{
			void bark() {
				System.out.println("Barking");
			}
		}
		class Cat extends HIE{
			void meow() {
				System.out.println("Meow");
			}
		}

class EG{
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		c.eat();
		d.bark();
	}
}