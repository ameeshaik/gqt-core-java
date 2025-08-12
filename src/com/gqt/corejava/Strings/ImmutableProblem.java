package com.gqt.corejava.Strings;

import java.util.Scanner;

public class ImmutableProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string-1");
		String str1=sc.next();
		System.out.println("enter string-2");
        String str2=sc.next();
        str1.concat(str2);//it  will return only 1st string 
        System.out.println(str1);

	}

}
