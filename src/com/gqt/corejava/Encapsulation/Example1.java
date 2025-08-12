package com.gqt.corejava.Encapsulation;
		class Lion{
			private String name;
			private String color;
			private String country;
			private int age;
			void setData1() {
				name="Kiran";
				color="yellow";
				country="africa";
				age=9;
			}
			void setData2(String a,String b,String c,int d) {
				name=a;
				color=b;
				country=c;
				age = d;
			}
			void getData() {
				System.out.println("Name="+name);
				System.out.println("color="+color);
				System.out.println("country="+country);
				System.out.println("age="+age);
			}
		}
			public class Example1 {
			public static void main(String[] args) {
				Lion l=new Lion();
				//l.name="sonu";//private numbers cannot be accessed outside the class
				//l.color="white";//private numbers cannot be accessed outside the class
				//l.country="india";//private numbers cannot be accessed outside the class
				//l.age=23;private numbers cannot be accessed outside the class
				l.setData1();
				l.getData();
				System.out.println("-----------");
				l.setData2("amee","green","india",23);
				l.getData();
			}
		}

	
