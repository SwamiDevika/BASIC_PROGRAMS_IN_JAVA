package com.firstprogram.abc;

 public class Npnr {

	public static void main(String[] args) {
		Calculator1 c1=new Calculator1();
		c1.add();
	}

}
 class Calculator1
{
	int a,b,c;
	void add() {
		int a=10;
		int b=20;
		c=a+b;
		System.out.println(c);
	}
}
