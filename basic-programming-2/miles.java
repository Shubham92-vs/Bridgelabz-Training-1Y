import java.util.Scanner;
class miles
{
    public static void main(String args [])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the kilometer");
	double km =sc.nextDouble();
	double miles=km*1.6;
	System.out.println(miles);
	}
}