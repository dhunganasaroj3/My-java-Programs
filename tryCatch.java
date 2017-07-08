import java.util.Scanner;

public class tryCatch{

	public static void main(String[] args){
	
		try{
		
			System.out.println("Please Enter the integer number");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
		} catch(Exception e){
		
			System.out.println("You have entered the String input" + e);
			System.out.println("Please Enter the correct number");
		}
	}
}
