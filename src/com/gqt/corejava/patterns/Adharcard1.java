package com.gqt.corejava.patterns;
import java.util.Scanner;
class Aadhar{
	String name;
	int age;
	static String nation;
	static {
		nation="indian";
	}
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("name:");
		name=sc.next();
		System.out.println("age:");
		age=sc.nextInt();
	}
	void displaydata() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("nation:"+nation);
	}
}		
public class Adharcard1 {
	public static void main(String args[]) {
		Aadhar a1=new Aadhar();
		Aadhar a2=new Aadhar();
		System.out.println("person1:");
		a1.collectdata();
		a1.displaydata();
		System.out.println("--------");
		System.out.println("person2:");
		a2.collectdata();
		a2.displaydata();
		System.out.println("--------");
	}
}
