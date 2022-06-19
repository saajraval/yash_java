package yash_java;
import java.util.Scanner;
public class CurrencyOptimize {
//500 200 100 50 20 10
	//1010% 500 = 10
	//amt/500 
	public static void main(String[] args) {
		// 420 -> 200 * 2 , 20 -> 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an amount :");
		int amt = sc.nextInt();
		int n500=0,n200=0,n100=0;
		if(amt>=500) {
			n500 = amt/500;
			amt = amt%500;
			System.out.println(amt);
		}
		if(amt>=200) {
			n200 = amt/200;
			amt= amt%200;
		}
		
		System.out.println("Number of notes of 500 :"+n500);
		System.out.println("Number of notes of 200 :"+n200);
	}
}
