package com.firstprogram.abc;

public class Typecasting {

	public static void main(String[] args) {
byte b=25,b2,b3,b4,b5,b6,b7;
short s=20000,s1,s3,s4,s5,s6,s7;
int i=21000000,i1,i2,i4,i5,i6,i7;
long l=91000000000l,l1,l2,l3,l5,l6,l7;
float f=45.5f,f1,f2,f3,f4,f6,f7;
double d= 45.456789,d1,d2,d3,d4,d5,d7;
char c='a',c1,c2,c3,c4,c5,c6;
boolean r=true;
System.out.println(i +"\t"+l+"\t" + f+"\t"+d+","+c+"\t"+r+"\t"+b);
//storing all data types in to byte
s1=b;
i1=b;
l1=b;
f1=b;
d1=b;
c1=(char)b;
System.out.println(i1 +"\t"+l1+"\t" + f1+"\t"+d1+","+c1+"\t"+s1);
//storing all data types in to short
b2=(byte)s;
i2=s;
l2=s;
f2=s;
d2=s;
c2=(char)s;
System.out.println(i2 +"\t"+l2+"\t" + f2+"\t"+d2+","+c2+"\t"+b2);
//	storing all data types into integer

	b3=(byte)i;
	s3=(short)i;
	l3=i;
	f3=i;
	d3=i;
	c3=(char)i;
	System.out.println(l3 +"\t"+s3+"\t" + f3+"\t"+d3+","+c3+"\t"+b3);
//	storing all data types into long
	b4=(byte)l;
	s4=(short)l;
	i4=(int)l;
	f4=l;
	d4=l;
	c4=(char)l;
	System.out.println(i4 +"\t"+s4+"\t" + f4+"\t"+d4+","+c4+"\t"+b4);
	
//	storing all data types into float
	b5=(byte)f;
	s5=(short)f;
	i5=(int)f;
	d5=f;
	c5=(char)f;
	l5=(long)f;
	System.out.println(i5 +"\t"+l5+"\t" + i5+"\t"+d5+","+c5+"\t"+b5+"\t"+s5);
//	storing all data types into double
	b6=(byte)d;
	s6=(short)d;
	i6=(int)d;
	l6=l;
	c6=(char)d;
	f6=(float)d;
	System.out.println(i6 +"\t"+s6+"\t" + f6+"\t"+l6+","+c6+"\t"+b6);
//	storing all data types into char
	b7=(byte)c;
	s7=(short)c;
	i7=c;
	d7=c;
	l7=c;
	f7=c;
	System.out.println(i7 +"\t"+l7+"\t" + f7+"\t"+d7+","+s7+"\t"+b7);
	
	}

}
