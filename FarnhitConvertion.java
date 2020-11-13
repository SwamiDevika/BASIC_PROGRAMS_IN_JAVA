package com.firstprogram.abc;

import java.util.Scanner;

public class FarnhitConvertion {

	public static void main(String[] args) {
		double c,fc,k=0,fk;
     	c=k;
		System.out.print("enter the celcius value that you want to convert:");
		Scanner scan=new Scanner(System.in);
		c=scan.nextInt();
		k=c;
		fc=(9/5)*c+32;
		System.out.print(c+"the faranheat value is"+fc);
//		k=(f+459.67)*(5/9);
		fk=(k-273.15)*(9/5)+32;
		System.out.print(k+"the faranheat value is"+fk);
		
	}

}
