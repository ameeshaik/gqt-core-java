package com.gqt.corejava.Encapsulation;

class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
void setData(String name,String color,String breed,int cost) {
	name=name;
	color=color;
	breed=breed;
	age = age;
	cost=cost;
}
void getData() {
	System.out.println("Name="+name);
	System.out.println("color="+color);
	System.out.println("breed="+breed);
	System.out.println("age="+age);
	System.out.println("cost="+cost);
}
}
public class Example2 {

	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.getData();
		
		
	}
}


	