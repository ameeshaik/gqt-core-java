package com.gqt.corejava.Constructor;

class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
 
	// zero parameterized constructor
	public Dog() {
		super();
		System.out.println("inside zero parameterized constructor");
		this.name="ramu";
		this.color="brown";
		this.cost=7000;
		this.age=3;
		this.breed="pamorian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	
	// one parameterized constructor
	public Dog(String name) {
		this();
		System.out.println("inside one parameterized constructor");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	
	// two parameterized constructor
	public Dog(String name,String color) {
		this("chintu");
		System.out.println("inside two parameterized constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");	
	}
	
	// three parameterized constructor
	public Dog(String name,String color,int cost) {
		this("tommy","blue");
		System.out.println("inside three parameterized constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");	
	}
	
	// four parameterized constructor
		public Dog(String name,String color,int cost,int age) {
			this("dobby","orange",9000);
			System.out.println("inside four parameterized constructor");
			this.name=name;
			this.color=color;
			this.cost=cost;
			this.age=age;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			System.out.println("---------");	
		}
		
		// five parameterized constructor
				public Dog(String name,String color,int cost,int age,String breed) {
					this("jimmy","purple",7500,7);
					System.out.println("inside five parameterized constructor");
					this.name=name;
					this.color=color;
					this.cost=cost;
					this.age=age;
					this.breed=breed;
					System.out.println(this.name);
					System.out.println(this.color);
					System.out.println(this.cost);
					System.out.println(this.age);
					System.out.println(this.breed);
					System.out.println("---------");	
				}
	}

public class Example1 {

	public static void main(String[] args) {
		Dog d1=new Dog("Rocky","white",8000,8,"GR");
	}
		
	}


