package com.firstprogram.abc;

public class Minimumvalue {

	public static void main(String[] args) {
int a=300;
int b=20;
int result=check(a,b);
System.out.println(result);
	}
public	static int check(int a,int b)
	{int low,high;
	if(a<b) {
		low=a;
		System.out.println(low);
		return(low);}
	
	else {
		low=b;
		System.out.println(low);}
			return(low);
			}
}

