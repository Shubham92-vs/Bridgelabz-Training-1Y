import java.util.Scanner;
class Assignmentoperator
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:-");
		int a=sc.nextInt();
		
		System.out.println("a:-");
		 a+=sc.nextInt();
		System.out.println("a:-");
		 a-=sc.nextInt();
		
		
		System.out.println("The result of Addition:-");
		System.out.println("The result of Subtraction:-");
	}
}