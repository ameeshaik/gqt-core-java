package com.gqt.corejava.Strings;

import java.util.Scanner;

public class MutableString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1=new StringBuffer("Ramayana");
		StringBuffer sb2=new StringBuffer("is the best mythological story");
       sb1.append(sb2);
       System.out.println(sb1);
       
       StringBuilder sb3=new StringBuilder("mahabaratha");
		StringBuilder sb4=new StringBuilder("is the best mythological history");
      sb3.append(sb4);
      System.out.println(sb3);

        
	}

}
