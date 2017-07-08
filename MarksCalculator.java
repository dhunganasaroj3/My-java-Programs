//import com.gatsby.java.*;
import java.util.*;

public class Main{
	public static int total = 0;
	public static int total1 = 0;
	public static int total2 = 0;
	public static int total3 = 0;
	public static void main(String[] args){


		Scanner input = new Scanner(System.in);
       		System.out.println("Program to Calculate the Marks");
		System.out.println("Please enter the require subject that you want to calculate");
		int val = input.nextInt();
		System.out.println("Please Enter the "+val+" Subjects Respectively");
		String[] subject = new String[val+1];
		char[] marks = new char[val];
		for (int i = 0; i<subject.length; i++){
			subject[i] = input.nextLine();
		}
		System.out.println("Please Enter the "+val+" Marks Respectively");
		for (int i = 0; i < marks.length; i++){
		
			marks[i] = input.next().charAt(0);

			if(marks[i] == 'a' || marks[i] == 'b' || marks[i] == 'c' || marks[i] == 'd' || marks[i] == 'f' || marks[i] == 'A' || marks[i] == 'B' || marks[i] == 'C' || marks[i] == 'D' || marks[i] == 'F'){
				continue;
			}
			else{
			System.out.println("Please enter the correct marks");
			marks[i] = input.next().charAt(0);

			}
		}		
		System.out.println("You have Entered the Following Subjects:-");
		for (String value : subject){
	
			System.out.println(value);
		}
		System.out.println();
		System.out.println("You have Entered the Following Marks:-");
		for(char value : marks){
		
			System.out.println(value);
		}
		for (int i = 0; i < marks.length; i++){
		
			if(marks[i] == 'a' || marks[i] == 'A'){
			
				int a = 4;
				total = total + a;
			}
			else if (marks[i] == 'b' || marks[i] == 'B'){
				
				int b = 3;
				total1 = total1 + b;
			}
			else if (marks[i] == 'c' || marks[i] == 'C'){
			
				int c = 2;
				total2 = total2 + c;
			}
			else if (marks[i] == 'd' || marks[i] == 'D'){
			
				int d = 1;
				total3 = total3 +d;
			}
			else{
				
				int f = 0;
			}
		}

		for (int i = 0; i < marks.length; i++){
		
			if(marks[i] == 'F' || marks[i] == 'f'){
			
				System.out.println();
				System.out.println("You have Failed the Exam");
				System.exit(1);
			}
			
		}
			double total4 = total + total1 + total2 + total3 / marks.length;
			System.out.println();
                	System.out.println("Your GPA is " +total4);
			System.out.println("Congratulation You've passed the Exam");
}
}
