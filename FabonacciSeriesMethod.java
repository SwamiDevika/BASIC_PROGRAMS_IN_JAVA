package com.firstprogram.abc;
import java.util.Scanner;

public class FabonacciSeriesMethod 
{

	public static void main(String[] args)
	{
		long index=0;
		System.out.print("enter the number to calculate fibonacci");
		Scanner input=new Scanner(System.in);
		index= input.nextInt();
		
	
        System.out.print(fib(index));
	}
 


public static  long fib(long index)

	{
		if(index==0)
			return 0;
		else if(index==1)
             return 1;
		else
			return(fib(index-1)+fib(index-2));
   	}
}
