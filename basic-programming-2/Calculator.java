import java.util.Scanner;
class Calculator
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:-");
		int a=sc.nextInt();
		System.out.println("enter the value of b:-");
		int b=sc.nextInt();
		int addition=a+b;
		int subtraction=a-b;
		int multiplication=a*b;
		int division=a/b;
		System.out.println("Addition:-"+addition);
		System.out.println("Subtraction:-"+subtraction);
		System.out.println("Multiplication:-"+multiplication);
		System.out.println("Division:-"+division);
	}
}