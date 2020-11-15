package com.firstprgrm.abc;
//import java.util.*;
//import java.lang.*;
//import java.io.*;
public class ReverseNumber {

	public static void main(String[] args)
	{
		//giving input
		String input="Saugandhika is best";
		StringBuilder c = new StringBuilder();
		//Append is a inbuilt method in java which is used to append the string representation of the boolean argument to a given seQuence
		c.append(input);
		System.out.println(c);
		//reversing the string
		c.reverse();
		System.out.println(c);
	}

}
