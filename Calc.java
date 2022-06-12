package yash_java;
import java.util.Scanner;
//math -> lang 
// add sub mul div mod sq   sqroot floor ceil 
public class Calc{

	int n1,n2;
	Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int d =(int)(Math.random()*10000);
		System.out.println("Random value "+d);//double 
		
		System.out.println("1 -Add");
		System.out.println("2-Sub");
		System.out.println("Enter your choice : ");
		int choice =sc.nextInt(); // 

		Calc obj = new Calc();
		switch(choice){
		
		case 1 :obj.scan(); 
			obj.add();
			  break;
		
		case 2	: obj.scan();
			 obj.sub();
			break;

		default : System.out.println("Invalid Choice!!");
		}//end of choice
	}//end of main


	void scan(){
		System.out.println("Enter two number :");
		 n1=sc.nextInt();
		 n2=sc.nextInt();
	}
		
	void add(){
		
		int x =n1+n2;
		System.out.println("SUM : "+x);
	}

	void sub(){
		int x =n1-n2;
		System.out.println("DIFFERENCE : "+x);
	}
}///end of Class