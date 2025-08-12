package com.gqt.corejava.Strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		
		//1.length()
		int len=str.length();
		System.out.println("length is"+len); // it will return length of a string
		
		//2.charAt()
		char c=str.charAt(0);//it will provide character  at specified position
		System.out.println(c);
		//char d=str.charAt(100);//it will provide exception  or error
		//System.out.println(d);
		
		//3.concat()
		String str1=str.concat("is the best batsman in the world");//it will merges the content of 2 strings
		System.out.println(str1);
		
		//4.contains
		Boolean res=str.contains("Ramesh");//it will check if the sub string is present in main string
		System.out.println(res);
		
		//5.endsWith()
		Boolean res2=str.endsWith("Tendulkar");//it will check the string is present at end or not
		System.out.println(res2);
		Boolean res3=str.endsWith("Tendukar");//it will return false
		System.out.println(res3);
		
		//6.startsWith()
		Boolean res4=str.startsWith("Sachin");//it will check the string is present at starting or not
		System.out.println(res4);
		Boolean res5=str.startsWith("Pachin");//it will return false
		System.out.println(res5);
		
		//7.getclass()
		Class class1=str.getClass();//it will provide that root class path of the object
		System.out.println(class1);
		
		//8.hashCode()
		int hashcode=str.hashCode();//it will return hash value of the given object
		System.out.println(hashcode);
		
		//9.index()
		int index1=str.indexOf("S");//it will return the index specified character in the main string
		System.out.println(index1);
		
		//10.isBlank()
		Boolean res6=str.isBlank();//it will check the string is empty or has only spaces
		System.out.println(res6);
		String str3="        ";
		res6=str3.isBlank();
		System.out.println(res6);
		String str4="";
		res6=str3.isBlank();
		System.out.println(res6);
		
		//11.isEmpty()
		Boolean res7=str.isEmpty();//it will check the string is empty 
		System.out.println(res7);
		String str5="        ";
		res7=str5.isEmpty();
		System.out.println(res7);
		String str6="";
		res7=str6.isEmpty();
		System.out.println(res7);
		
		//12.lastIndexOf()
		int lastIndex=str.lastIndexOf("e");//it will gives the last index of the character
		System.out.println(lastIndex);
		
		//13.replace()
		String replace=str.replace('S', '$');// it will replace the specified character
		System.out.println(replace);
		
		//14.subString()
		String substring=str.substring(6);// it will provide the substring from the specified position
		System.out.println(substring);
		
		//15subString(start,end)
		String substring1=str.substring(6,12);// it will provide the substring from the specified position to end postion
		System.out.println(substring1);
		
		//16.toupperCase()
		String uppercase=str.toUpperCase();// it will provide the string into upperCase
		System.out.println(uppercase);
		
		//17.toLowerCase()
		String toLowerCase=str.toLowerCase();// it will provide the string into lowerCase
		System.out.println(toLowerCase);	
	}

}
