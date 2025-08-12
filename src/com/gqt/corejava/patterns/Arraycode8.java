package com.gqt.corejava.patterns;
import java.util.Scanner;
class Arrayoperationsnew5{
String arr[][][];
long sum_rev;
long med_rev;
long eng_rev;
long deg_rev;
long sum_med_rev;
long sum_eng_rev;
long sum_deg_rev;

String names;
long revenue;
Scanner sc=new Scanner(System.in);
void createArray() {
	System.out.println("enter the   college count:");
	int clg=sc.nextInt();
	
	
	// creating the 3D array
		arr=new String[clg][][]; 
		
		// creating class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter classroom count inside students no:"+(i+1));
			
			arr[i]=new String[sc.nextInt()][];
			sc.nextInt();
		}
		
		// collecting student count
         for(int i=0;i<arr.length;i++) {
        	 System.out.println("inside class :"+(i+1));
        	 for(int j=0;j<arr[i].length;j++) {
        		 System.out.println("enter the student count inside classroom no:"+(j+1));
        	 arr[i][j]=new String[sc.nextInt()];
        	 sc.nextInt();
         }
}


	System.out.println("Array is created:");
	 System.out.println("--------");
	 
	 System.out.println("annual fee paid  by  medical students ")	;
	 med_rev=sc.nextLong();
	 System.out.println("annual fee paid  by  engineering students ")	;
	 eng_rev=sc.nextLong();
	 System.out.println("annual fee paid  by  degree students ")	;
	 deg_rev=sc.nextLong();
	
	 System.out.println("--------");	
}

void collectData()
{
	for(int i=0;i<arr.length;i++) {
		System.out.println("Inside category no: " +(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class no"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the names of the student no : "+(k+1));
				arr[i][j][k]=sc.next();
				if(i==0)
				{
					sum_med_rev+=med_rev;


				}
				else if(i==1)
				{
					sum_eng_rev+=eng_rev;
				}
				else {
					sum_deg_rev+=deg_rev;
				}
			}
		}

	}
	System.out.println("Data is collected and calculated in an array");
	System.out.println("---------------");	

	sum_rev=sum_med_rev+sum_eng_rev+sum_deg_rev;
	System.out.println("The overall revenue is "+(sum_rev));

}

		void displayData() {

			for(int i=0;i<arr.length;i++) {
				System.out.println("inside college no:"+(i+1));
				for(int j=0;j<arr[i].length;j++){
					System.out.println("inside class no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println(" enter the names of students no:"+(k+1)+" is ="+arr[i][j][k]);
				}
			}
			}
				
		}
}
public class Arraycode8 {

	public static void main(String[] args) {
		Arrayoperationsnew5 ao=new Arrayoperationsnew5();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
		
}

