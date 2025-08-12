package com.gqt.corejava.patterns;

import java.util.Scanner;
class Arrayoperationsnew4{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("enter the language count:");
		int lan=sc.nextInt();
		System.out.println("enter the categories count in each language:");
		int cat=sc.nextInt();
		System.out.println("enter the movie count in each categories:");
		int mov=sc.nextInt();
		
		// creating the 3D array
			arr=new long[lan][cat][mov]; 
			System.out.println("array is created");
		 System.out.println("--------");
		 
		 System.out.println("investment made by amee ")	;
		 investment=sc.nextLong();
		 
		 System.out.println(" profit made in the financial year 2024-2025");
		 prev_profit=sc.nextLong();
		 
		 System.out.println("--------");
		 
		 
	}
		
	void collectRevenueData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter  the language no:"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter the categories  no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the   revenue of movie no:"+(k+1));
				arr[i][j][k]=sc.nextLong();
				sum_revenue+=arr[i][j][k];
			}
		}
		}
			System.out.println("Data collected & calculated");
			 System.out.println("--------");
			 }
	
			void displayData() {

				for(int i=0;i<arr.length;i++) {
					System.out.println("inside the language no:"+(i+1));
					for(int j=0;j<arr[i].length;j++){
						System.out.println("inside categories no:"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println(" the revenue of movie no:"+(k+1)+" is ="+arr[i][j][k]);
					}
				}
				}
					System.out.println("--------");
					System.out.println("overall revenue:"+sum_revenue);
					System.out.println("--------");
					if(sum_revenue>investment) {
						long profit=(sum_revenue-investment);
						System.out.println(" the profit made by amee is="+profit);
						if( profit>prev_profit){
							System.out.println("amee has made more profit than previous year");
						}
						else {
							System.out.println("amee has not made more profit than previous year");
						}
					}
						else {
							System.out.println("the loss incured by amee is="+(investment-sum_revenue));
						}
						}
							
						}
						
				
	
public class Arraycode7 {

	public static void main(String[] args) {
		Arrayoperationsnew4 ao=new Arrayoperationsnew4();
		ao.createArray();
		ao.collectRevenueData();
		ao.displayData();
	}
		
}


		