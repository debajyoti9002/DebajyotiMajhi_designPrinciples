package design_principles;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
		System.out.print("Enter Your Choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter 1st number");
			 a=sc.nextInt();
			System.out.println("Enter 2nd number");
			 b=sc.nextInt();
			addition(a,b);
			break;
		case 2:
			System.out.println("Enter 1st number");
			 a=sc.nextInt();
			System.out.println("Enter 2nd number");
			 b=sc.nextInt();
			subtraction(a,b);
			break;
		case 3:
			System.out.println("Enter 1st number");
			 a=sc.nextInt();
			System.out.println("Enter 2nd number");
			 b=sc.nextInt();
			multiplication(a,b);
			break;
		case 4:
			System.out.println("Enter 1st number");
			 a=sc.nextInt();
			System.out.println("Enter 2nd number");
			 b=sc.nextInt();
			division(a,b);
			break;
		case 5:
			System.out.print("Successfully exited");
			break;
		
		}
	}
	
	
	public static void addition(int x, int y) {
		System.out.println("The addition of "+ x + "and "+ y + "is "+ (x+y));
	}
	
	public static void subtraction(int x, int y) {
		System.out.println("The subtraction of "+ x + "and "+ y + "is "+ (x-y));
	}
	
	public static void multiplication(int x, int y) {
		System.out.println("The subtraction of "+ x + "and "+ y + "is "+ (x*y));
	}
	
	public static void division(int x, int y) {
		System.out.println("The subtraction of "+ x + "and "+ y + "is "+ (x/y));
	}

}