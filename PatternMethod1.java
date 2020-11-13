package com.firstprogram.abc;
import java.util.Scanner;

public class PatternMethod1
{

	public static void main(String[] args)
	{
		int n;
		System.out.print("enter the pattern");
		Scanner scan=new Scanner(System.in);
		n= scan.nextInt();
		for(int j=0;j<10;++j)
		{
			for(int i=0;i<4;++i)
			{
				if(i%2==0) 
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\n");
			
		}
		
	for(int j=0;j<6;++j)
	{
		for(int i=0;i<6;++i)
		{
			if(i==j||i>j) 
			{
			System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		}System.out.print("\n");
		
		}
	
	for(int j=6;j>0;--j)
	{
		for(int i=1;i<7;++i)
		{
			if(i==j||i>j) 
			{
			System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		}System.out.print("\n");
		
		}
	
	for(int j=0;j<6;++j)
	{
		for(int i=0;i<6;++i)
		{
			if(i==j||i<j) 
			{
			System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		}System.out.print("\n");
		
		}
	for(int j=6;j>0;--j)
	{
		for(int i=1;i<7;++i)
		{
			if(i==j||i<j) 
			{
			System.out.print("*");
		    }
			else
			{
				System.out.print(" ");
			}
		}System.out.print("\n");
		
		}
	for(int j=6;j>0;--j)
	{
		for(int i=1;i<7;++i)
		{
			if(i==j||i>j) 
			{
			System.out.print("*");
		    }
			else if(i==j)
			{
				System.out.print("$");
				
			}
			
			else
			{
				System.out.print(" ");
			}
		}System.out.print("\n");
		
		}
	for(int i=6;i>0;--i)
	{
		for(int j=0;j<=6;++j)
		{
			if(i>j)
			System.out.print("*");
			
			else
				System.out.print(" ");
		}System.out.print("\n");
	}
	for(int i=0;i<6;++i)
    {
 	   for(int j=0;j<6;j++)
 	   {
 		   if (i<j)
 		   {
 			   System.out.print(" ");
 		   }
 		   else
 		   {
 			   System.out.print("*");
 		   }
 	   }System.out.print("\n");
    }
       for(int i=0;i<6;++i)
       {
    	   for(int j=0;j<6;j++)
    	   {
    		   if (i>j)
    		   {
    			   System.out.print(" ");
    		   }
    		   else
    		   {
    			   System.out.print("*");
    		   }
    	   }System.out.print("\n");
       }
       
       
       for(int j=8;j>0;--j)
   	{
   		for(int i=1;i<=7;++i)
   		{
   			if(i==j||i>j) 
   			{
   			System.out.print(" ");
   		    }
   			
   			
   			else
   			{
   				System.out.print("*");
   			}
   		}System.out.print("\n");
	}
       
       for(int j=0;j<=7;++j)
   	{
   		for(int i=0;i<=7;++i)
   		{
   			if(i==j||i>j) 
   			{
   			System.out.print(" ");
   		    }
   			
   			
   			else
   			{
   				System.out.print("*");
   			}
   		}System.out.print("\n");
    }
       for(int i=0;i<=11;++i) 
	     {
	    	 for(int j=0;j<=5;++j)
	    	 {
	    		 if(i==j||i>j)
	    		 {
	    			 System.out.print("*");
	    		 }
	    		 else
	    			 System.out.print(" ");
	    	 }System.out.print("\n");
	    	 
	     }
		
		for(int i=0;i<=10;++i)
		{
		for(int j=5;j<=10;++j)
 	 {
 		 if(i==j||i>j)
 		 {
 			 System.out.print("");
 		 }
 		 else
 			 System.out.print("*");
 	 }System.out.print("\n");
	}
     
}
}

