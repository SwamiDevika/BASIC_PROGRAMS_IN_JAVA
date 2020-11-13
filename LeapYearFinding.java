package com.firstprogram.abc;
import java.util.Scanner;

public class LeapYearFinding 
{

	public static void main(String[] args)
	{
          int year;
		System.out.println("enter the year that you want to check");
		Scanner scan=new Scanner(System.in);
		year=scan.nextInt();
		if(year==0)
		{
			System.out.print("invalid input");
		}
		else if((year%4==0)||(year%100==0)&&(year%400==0))
		{
			System.out.println("this year is leapyear\t"+year);
		}
		else
		{
			System.out.print("this is not leap year");
		}
		
         
	}

}
