package com.gqt.corejava.Encapsulation;

class Dog1{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
void setData(String name,String color,String breed,int age,int cost) {
	this.name=name;
	this.color=color;
	this.breed=breed;
	this.age = age;
	this.cost=cost;
}
void getData() {
	System.out.println("Name="+name);
	System.out.println("color="+color);
	System.out.println("breed="+breed);
	System.out.println("age="+age);
	System.out.println("cost="+cost);
}
}
public class Example3 {

	public static void main(String[] args) {
		Dog1 d1=new Dog1();
		d1.setData("chimtu","brown","local",23,5000);
		d1.getData();

	}

}
