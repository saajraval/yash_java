package yash_java;

/*

	inti;
	while(condition){
		statements;
		inc/dec;
	}
Q: take range from user 
	and display odd and even number in different line 
	also do their sums 
	
	Eg 1 10
	Even: 2 4 6 8 10
	Odd : 1 3 5 7 9 

	Sum of even : 30
	Sum of odd : 25




*/

import java.util.Scanner;

public class NaturalNos{

	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number till you want to print  : ");
		int num= sc.nextInt();
		int i=1,sume=0;
		System.out.println(" Even numbers are : ");
		while(i<=num){
			if(i%2==0){
				System.out.print(" "+i);
				sume+=i;// sum =sum+i
			}
			i++;
		}//end of while
		System.out.println("Sum of even numbers is : "+sume);
	}//end of main
}//end of class