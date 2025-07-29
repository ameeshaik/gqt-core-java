package com.gtq.corejava.staticsegment;

import java.util.Scanner;

public class WrapperExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte data:");
		Byte b=new Byte(sc.nextByte());
		System.out.println("the Byte data="+b);
		System.out.println("--------");
		System.out.println("enter the short data:");
		Short s=new Short(sc.nextShort());
		System.out.println("the short data="+s);
		System.out.println("--------");
		System.out.println("enter the Integer data:");
		Integer i=new Integer(sc.nextInt());
		System.out.println("the Int data="+i);
		System.out.println("--------");
		System.out.println("enter the Long data:");
		Long l=new Long(sc.nextLong());
		System.out.println("the Long data="+l);
		System.out.println("--------");
		System.out.println("enter the Float data:");
		Float f=new Float(sc.nextFloat());
		System.out.println("the Float data="+f);
		System.out.println("--------");
		System.out.println("enter the Double data:");
		Double d=new Double(sc.nextDouble());
		System.out.println("the Double data="+d);
		System.out.println("--------");
		System.out.println("enter the String data:");
		String str=new String(sc.nextLine());
		sc.nextLine();
		System.out.println("the String data="+s);
		System.out.println("--------");
		Character c=new Character('a');
		System.out.println("the Character data="+c);
		System.out.println("--------");
		System.out.println("enter the Boolean data:");
		Boolean b1=new Boolean(true);
		System.out.println("the Boolean data="+b1);
		sc.close();
	}
}
		
