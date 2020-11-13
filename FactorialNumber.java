package com.firstprogram.abc;
import java.util.Scanner;

public class FactorialNumber 
{

	public static void main(String[] args)
	{
      int n,fact=1;
      System.out.println("of which number you want to calculate the factorial?" );
      Scanner scan=new Scanner(System.in);
     n= scan.nextInt();
    		  
      for(int i=1;i<=n;i++) {
    	  fact*=i;
    	  
      }System.out.print("factorial of "+n+"\tis\t"+fact);
      
	}

}
