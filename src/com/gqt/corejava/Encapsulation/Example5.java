package com.gqt.corejava.Encapsulation;
import java.util.Scanner;
class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	}



public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dog3 d2=new Dog3();
		System.out.println("enter the name");
		String name=sc.nextLine();
		d2.setName(name);
		System.out.println("enter the color");
		String color=sc.nextLine();
		d2.setColor(color);
		System.out.println("enter the breed");
		String breed=sc.nextLine();
		d2.setBreed(breed);	
		System.out.println("enter the age");
		int age=sc.nextInt();
		d2.setAge(age);
		System.out.println("enter the cost");
		int cost=sc.nextInt();
		d2.setCost(cost);
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		
		
		
		
	}

}
