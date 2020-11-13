package com.firstprogram.abc;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
     int a=2;
     int b=3;
     int p;
     int q;
     System.out.println("enter q value");
     Scanner scan=new Scanner(System.in);
    
     q=scan.nextInt();
     System.out.println("enter the value for p");
   
      p =scan.nextInt();
      scan.close();

     int c=a+b+p+q;
     System.out.println(+c);
	}

}
