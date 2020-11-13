package com.firstprogram.abc;
import java.math.BigDecimal;

public class CheckABC {

	public static void main(String[] args) {
		int a=65;
		int b=065;
		int c=0x65;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int t_emp$=12;
		System.out.println(t_emp$);
		float d=4_5.5F;
		System.out.println(d);
		long e=46;
		System.out.println(e);
		int $=56;
		System.out.println($);
		
		byte f=127;
		++f;
           System.out.println(f);
           short g=-32768;
           --g;
           System.out.println(g);
           int h=2147483647;
           ++h;
		   System.out.println(h);
		   long i=9223372036854775807l;
		   ++i;
		   System.out.println(i);
float j=3.4e38f+3.4e38f;
System.out.println(j);
float k=-3.4e38f-3.4e38f;
System.out.println(k);
float l=3.4e38f;
++l;
System.out.println(l);
double m=-1.7e308;
--m;
System.out.println(m);
double n=1.7e308+1.7e308;
System.out.println(n);
double o=-1.7e308-1.7e308;
System.out.println(o);
char p=65535;
++p;
System.out.println(p);
char q=(char)(p+65);
System.out.println(q);
System.out.println(10>9);
boolean r=true;
	System.out.println(r);
	boolean s=false;
	System.out.println(s);
float t=36.5123f;
if(t==36.5123) {
	System.out.println("exact value");
}
else {
	System.out.println("aproximate value");
}
float u=3.45678902345645678f;
System.out.println(u);
double v=3.45678902345645678;
System.out.println(v);
BigDecimal w=new BigDecimal(36.51625);
BigDecimal x=new BigDecimal(6.52461);
BigDecimal y=w.subtract(x);
System.out.println(y);
float z=36.51625f;
float z1=6.52461f;
float z2=(z-z1);
System.out.println(z2);
double d1=36.51625;
double d2=6.52461;
double d3=(d1-d2);
System.out.println(d3);

	}

}
