package yash_java;
import java.util.Scanner;
public class ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range ");
		int num1= sc.nextInt();
		System.out.println("Enter the ending range ");
		int num2 = sc.nextInt();
		
		for(int i=num1 ;i<=num2;i++) {
		int count =0,temp;
		temp = i;//123
		while(temp>0) {//0
			temp/=10;//0
			count++;//3
		}//end of while
		temp=i;
		int r,sum=0;
		while(temp>0) {
			r= temp%10;
			sum+=(int)(Math.pow(r, count));// 2 4
			temp/=10;
		}
		if(sum == i) {
			System.out.println(" "+i);
		}
		}//end of for
	}//end of main
}//end of class
