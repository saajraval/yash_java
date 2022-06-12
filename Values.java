package yash_java;
// Data types in java 2 => primitive and non primitive 

// boolean char byte short int float double   

public class Values{
		boolean b;
		char ch;
		byte by;
		short s;
		int i;
		float f;
		double d;
	public static void main(String [] args){
		Values v = new Values();
		v.Display();
	}//end of main

	void Display(){
		System.out.println("Boolean :"+b);
		System.out.println("Char :"+ch);
		System.out.println("Byte :"+by);
		System.out.println("Short :"+s);
		System.out.println("Integer:"+i);
		System.out.println("Float :"+f);
		System.out.println("Double :"+d);
		}
}//end of class