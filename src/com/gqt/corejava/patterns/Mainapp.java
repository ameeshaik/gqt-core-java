package com.gtq.corejava.staticsegment;
import java.util.Scanner;
class farmer{
	String name;
	int age;
	String crop;
	static String weather;
	static {
		weather="rainy";
	}
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("name:");
		name=sc.next();
		System.out.println("age:");
		age=sc.nextInt();
		System.out.println("crop:");
	    crop=sc.next();
	}
	void displaydata() {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("crop:"+crop);
	System.out.println("weather:"+weather);
	}
}
public class Mainapp {
	public static void main(String[] args) {
		farmer f1=new farmer();
		farmer f2=new farmer();
		System.out.println("person1:");
		f1.collectdata();
		f1.displaydata();
		System.out.println("person2:");
		f2.collectdata();
		f2.displaydata();
	}
}
