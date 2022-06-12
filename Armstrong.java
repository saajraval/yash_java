package yash_java;
import java.util.Scanner;
public class Armstrong {

	// 5%10 = 2
	//123 = 1 + 8 +27 =36
	//153 = 1 + 125 +27 =153
	// 1 2 3 4  6 7 8 9 153 370 371 407 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int num= sc.nextInt();//123 
		
		int r,sum=0,temp = num;
		while(temp>0) {//1
			r=temp % 10;//1
			sum+= (r*r*r);//27+8+1 =36
			temp/=10;//0
		}//end of while
		if(sum == num) {
			System.out.println("Armstrong number !! ");
		}//end of if
		else {
			System.out.println("Not an Armstrong number !! ");
		}
	}//end of main
}//end of class
