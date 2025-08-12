package com.gqt.corejava.patterns;
import java.util.Scanner;
class Arrayoperationsnew1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("enter class count:");
		int cls=sc.nextInt();
		arr=new String[cls][];
		for(int i=0;i<arr.length;i++) {
		System.out.println("enter the count of students inside the class no:"+(i+1));
		arr[i]=new String[sc.nextInt()];
		}
		System.out.println("Array is created:");
		 System.out.println("--------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside  the class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter the name of student no:"+(j+1));
				arr[i][j]=sc.next();
			}}
			System.out.println("Data collected");
			 System.out.println("--------");
			}
			void displayData() {

				for(int i=0;i<arr.length;i++) {
					System.out.println("inside class no:"+(i+1));
					for(int j=0;j<arr[i].length;j++){
						System.out.println("the name of student no:"+(j+1)+" is ="+arr[i][j]);
					}}
					System.out.println("--------");
		}}
public class Arraycode4 {

	public static void main(String[] args) {
		Arrayoperationsnew1 ao=new Arrayoperationsnew1();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}}


		

	
