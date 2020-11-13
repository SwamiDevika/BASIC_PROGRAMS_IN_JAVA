package com.firstprogram.abc;
import java.util.Scanner;

public class FabonaccySeries
{

	public static void main(String[] args)
	{
		int n1=0;
		int n2=1;
		int fab=0;
		System.out.print("enter the maximum range of fabonacci ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print(n1+"\t"+n2+"\t");
		for(int i=n-1;i>0;--i)
		{
			 fab=n1+n2;
			n1=n2;n2=fab;
			System.out.print(fab+"\t");
		}
			
			
	}

}
