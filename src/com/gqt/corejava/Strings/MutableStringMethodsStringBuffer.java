package com.gqt.corejava.Strings;

import java.util.Scanner;

public class MutableStringMethodsStringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1=new StringBuffer("Ramayana");
		StringBuffer sb2=new StringBuffer("kuran");
		  StringBuilder sb3=new StringBuilder("mahabaratha");
			StringBuilder sb4=new StringBuilder("bibel");
		
		//1.length()
        int len1=sb1.length();
        System.out.println("the length of ramayana"+len1);
        int len2=sb2.length();
        System.out.println("the length of kuran "+len2);
        int len3=sb3.length();
        System.out.println("the length of  mahabaratha"+len3);
        
        
        //2.charAt()
        char c=sb1.charAt(0);
        System.out.println("the character at 0 th position is "+c);
        char c1=sb2.charAt(1);
        System.out.println("the character at 1 th position is "+c1);
        char c2=sb4.charAt(3);
        System.out.println("the character at 3 th position is "+c2);
        
        //3.append()
        sb1.append(sb2);
        System.out.println(sb1);
        System.out.println(sb2);
        
        //4.getclass()
        Class class1=sb1.getClass();
        System.out.println(class1);
        
        //5.hashcode()
        int hashcode=sb1.hashCode();
        System.out.println(hashcode);
        
        //6.indexOf()
        int index1=sb1.indexOf("R");
        System.out.println(index1);
        int index2=sb2.indexOf("K");
        System.out.println(index1);
       	
	    //7.SubString(int start)
        String substring=sb1.substring(7);
        System.out.println(substring);
        
        //8.substring(int start,int end)
        String substring1=sb2.substring(3);
        System.out.println(substring1);
        
        
        
       
        
        
	}
	    

}
