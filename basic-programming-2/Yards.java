import java.util.Scanner;
class Yards
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in Feet:-");
		double Feet=sc.nextDouble();
		double Yard=3*Feet;
		double Miles=1760*Yard;
		System.out.println("convert Feet into Yard:-"+Yard);
		System.out.println("convert Yard into Miles:-"+Miles);
	}
}