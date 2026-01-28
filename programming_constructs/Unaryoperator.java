import java.util.Scanner;
class Unaryoperator
{
	public static void main(String args [])
	{
		Scanner unary=new Scanner(System.in);
		System.out.println("enter the number:-");
		int a=unary.nextInt();
		System.out.println(a++);
		System.out.println(++a);
	}
}