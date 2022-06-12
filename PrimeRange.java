package yash_java;
import java.util.Scanner;
public class PrimeRange {
// 1- 10 => 2 3 5 7 9
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int num1 = sc.nextInt();//12
		System.out.println("Enter the upper limit");
		int num2 = sc.nextInt();//20
		for(int i =num1 ;i<=num2;i++) {//12
			boolean flag = true;//12
			if(i==1) {
				flag = false;
			}
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = false;
				}
			}//end of inner for
			if(flag) { // if(flag == true)
				System.out.println(" "+i);
			}
		}//end of for
	}//end of main
}//end of class
