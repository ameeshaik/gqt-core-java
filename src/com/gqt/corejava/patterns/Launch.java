package com.gqt.corejava.patterns;
class program2
{
    int a,b,c;
	static int p,q,r;
	{
		a=100;
		b=200;
		c=300;
		p=9;
		q=8;
		r=7;
	}
		static {
			p=1;
			q=2;
			r=3;
			a=8
			b=3;
			c=7;
		}
		void display1() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
		}
		static void display2() {
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
	}
}
public class Launch {
public static void main(String args[]){
	program2.display2();
	program2 p1=new program2();
	p1.display1();
	p1.display2();
}
}
