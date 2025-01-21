package com.leetcode.practice.dsalgo.javaPrac;

public class Inheritance {

	public static void main(String[] args) {
		Base b = new Derived();
		b.show();
		b = new Base();
		b.show();
		Derived d = new Derived();
		d.show();
		
	}

}

class Base {
	Base() {
		System.out.println("Inside Base");
	}
	
	public static void show() {
		System.out.println("Show::Base");
	}
}

class Derived extends Base{
	Derived() {
		System.out.println("Inside Derived");
	}
	
	public static void show() {
		System.out.println("Show::Derived");
	}
}
