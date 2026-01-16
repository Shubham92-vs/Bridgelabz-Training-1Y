import java.util.Scanner;
class Sam
{
	public static void main(String args [])
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("enter maths number:");
		int a=sc.nextInt();
		System.out.println("enter physics number:");
		int b=sc.nextInt();
		System.out.println("enter chemistry number:");
		int c=sc.nextInt();
		int average=(a+b+c)/3;
		System.out.println("Calculate Sam Average :- "+average);
	}
}
