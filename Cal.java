package yash_java;
import java.util.Scanner; 
public class Cal{

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		//class  obj 	key   class 	method 
/*
		int a=3,b=4;
		int sum;
		sum = a+b;
		//sub =a-b;
		// sum : 7 of a and b
		// 3 + 4 = 7
		System.out.println("\n Sum : "+sum);
		//System.out.println(a+" + "+b+" = "+sum);
*/
		int a,b,sum;
		System.out.println("Enter two numbers to add : ");
		a=sc.nextInt();
		b=sc.nextInt();
	
		//sum =a+b;
		//System.out.println("Sum : "+sum);

		System.out.println("\n 1- Addition\n 2-Subtraction\n Enter your choice : ");
		int choice =sc.nextInt();
			// + - * / % 
		switch(choice){
			case 1 : sum =a+b;
					System.out.println("Sum : "+sum);
					break;

			case 2: sum =a-b;
					System.out.println("Difference : "+sum);
					break;
		}//end of switch 
	}//end of main
}//end of class 