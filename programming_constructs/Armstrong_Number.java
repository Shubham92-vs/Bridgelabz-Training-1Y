import java.util.Scanner;
class Armstrong_Number
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int original_num=num;
		int result=0;
		while(num!=0)
		{
			int digit=num%10;
			result+=digit*digit*digit*digit;
			num=num/10;
		}
		if(result==original_num)
		{
			System.out.println("is armstrong_number");
		}
		else
		{
			System.out.println("is not armstrong_number");
		}
	}
}
		