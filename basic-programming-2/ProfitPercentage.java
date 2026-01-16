import java.util.Scanner;
class ProfitPercentage
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost price:");
		double a=sc.nextDouble();
		System.out.println("enter selling price:");
		double b=sc.nextDouble();
		double profit=b-a;
		double profitpercentage=(profit/a)*100;
		System.out.println("ProfitPercentage :- "+profitpercentage);
	}
}