import java.util.Scanner;
class Subject
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the physics");
		int phy=sc.nextInt();
		System.out.println("enter the chemistry");
		int chem=sc.nextInt();
		System.out.println("enter the maths");
		int maths=sc.nextInt();
		double sum=phy+chem+maths;
		double total=sum/3;
		if(total>=90)
		{
			System.out.println("excellent");
		}
		else if(total>=75)
		{
			System.out.println("very good");
		}
		else if(total>=60)
		{
			System.out.println("good");
		}
	}
}