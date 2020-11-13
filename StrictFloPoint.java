package com.firstprogram.abc;

strictfp class StrictFloPoint {

	public static void main(String[] args) {
		
		float a=22f;
		float b=3f;
		float c=a/b;
		System.out.println(c);
		demo d=new demo();
		d.sub();
		
	}

}
class demo{
	strictfp void sub() {
		float p=22f;
		float q=3f;
		float d=p/q;
		System.out.println(d);
		
	}
}
