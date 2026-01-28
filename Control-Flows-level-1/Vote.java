import java.util.Scanner;
class Vote
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the personage:-");
		int personage=sc.nextInt();
		if(personage>=18)
		{
			System.out.println("A person can vote");
		}
		else
		{
			System.out.println("A person cannot vote");
		}
	}
}