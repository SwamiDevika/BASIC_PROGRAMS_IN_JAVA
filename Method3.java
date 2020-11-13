package com.firstprogram.abc;

public class Method3 {

	public static void main(String[] args) {
//		with parameter with return value
       Rama r=new Rama();
       int a=10,b=30;
       int s;
      s= r.add(a,b);
      System.out.println(s);
	}

}
class Rama
{int temp;
	int add(int x,int y)
	{
		temp=x+y;
		return temp;
	}
	
}
