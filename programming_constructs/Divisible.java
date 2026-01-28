import java.util.Scanner;
class Divisible
{
	public static void main(String args [])
	{
		Scanner div=new Scanner(System.in);
		System.out.println("enter the number:-");
		int a=div.nextInt();
		if(a%5==0)
		{
			System.out.println("Number Divisible by 5");
		}
		else
		{
			System.out.println("Number not Divisible by 5");
		}
	}
}
		