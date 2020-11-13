package com.firstprogram.abc;
/**
calculating the no of packets needed to store 400 apples with condition that each packet contain only 8 apple without using Division symbol(/)
creted apple class
@author saugandhika
@version 15.0
@since 14-11-2020
*/
public class Apple {
	/**
	this method is used to calculate no of packets needed
	@param count
	@param apple
	@param args unused
	*/

	public static void main(String[] args) 
	{
		int apple=0;
	    int count=0;
		while(apple<400)
		{
		apple+=8;
		++count;
		}
		System.out.print("no of packets\t"+count);
	}

}
