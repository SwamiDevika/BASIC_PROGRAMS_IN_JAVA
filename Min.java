package com.firstprogram.abc;
import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
int a;
int b;

Scanner scan=new Scanner(System.in);
System.out.println("enter the a value");
a=scan.nextInt();
System.out.println("enter the b value");
b=scan.nextInt();
//sss(a,b);
//System.out.println("lower value\n"+result);
	}
public	static void sss(int a,int b )
	{
	int low;
	if(a<b) {
		low=a;
		System.out.print(low);}
	
	else {
		low=b;
			System.out.print(low);	}
}
}
