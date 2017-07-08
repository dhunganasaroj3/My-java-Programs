import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number");
		double val1 = input.nextDouble();
		System.out.println("Enter the Second Number");
		double val2 = input.nextDouble();
		System.out.println("Please Enter The Choice:");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Subtract");
		System.out.println("4.Divide");
		int val3 = input.nextInt();
		double val4 = getValues(val3,val1,val2);
		System.out.println(val4+" is the result");
	}
	public static double getValues(int val3,double val1,double val2){
		double val4 = 0;
		switch(val3){
			case 1:
				{
				 val4 = val1 + val2;
				break;
				}
			case 2:
				{
				val4 = val1 - val2;
				break;
				}
			case 3:
				{
				val4 = val1 * val2;
				break;
				}
			case 4:
				{
				 val4 = val1 / val2;
				break;
				}
			default:
				{
				System.out.println("Please Enter the Correct Number");
				}
		}
		return val4;

	}
}
