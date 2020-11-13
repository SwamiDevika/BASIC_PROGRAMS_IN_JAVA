package com.firstprogram.abc;

public class Method4 {

	public static void main(String[] args) {
// with value without return 
		int a=20,b=70;
		Sub s3=new Sub();
		s3.add(a,b);
	}

}
class Sub
{int x,y,temp;
	void add(int x,int y) {
		temp=x+y;
		System.out.print(temp);
	}
}