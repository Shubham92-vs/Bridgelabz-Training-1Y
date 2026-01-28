import java.util.Scanner;
class Season
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month:-");
		int month=sc.nextInt();
		System.out.println("enter the day:-");
		int day=sc.nextInt();
		if(month ==3&&day>=20)
		{
			System.out.println("it is a spring season");
		}
		else
		{
			System.out.println("it is not a spring season");
		}
	}
}
	