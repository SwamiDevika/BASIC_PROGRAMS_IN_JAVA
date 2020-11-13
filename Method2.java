package com.firstprogram.abc;

public class Method2 {

	public static void main(String[] args) {
//		no parameter with return type
		Suma s1=new Suma();
		s1.add();

	}

}
class Suma{
	int a,b,c;
	int add () {
		a=12;
		b=24;
		c=a+b;
		System.out.print(c);
		return c;
		
	}
	
}