package com.firstprogram.abc;

public class  ObjectCreation implements Cloneable{
	String name;
	String breed;
	int cost;
	public static void main(String[] args)throws Exception
		{
		 ObjectCreation d1=new  ObjectCreation();
		 ObjectCreation d2 = (ObjectCreation)d1.clone();
		 d1.name="dogii";
		 d1.breed="sog";
		 d1.cost=2000;
		System.out.println(d1.name);
		System.out.println(d1.breed);
		System.out.println(d1.cost);
		
			System.out.println(d2.name);
			System.out.println(d2.breed);
			System.out.println(d2.cost);
		}

}
