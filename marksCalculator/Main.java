import com.gatsby.java.*;
import java.util.*;

public class Main{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
       		System.out.println("Program to Calculate the Marks");
		System.out.println("Please enter the require subject that you want to calculate");
		int val = input.nextInt();
		System.out.println("Please Enter the "+val+" Subjects Respectively");
		stringInput.Main(val);
		System.out.println("Please Enter the "+val+" marksRespectively");
		char[] marks = charInput.Main(val);
		Calculate Calc = new Calculate();
		double total4 = Calc.marksCalculate(marks);
		Fail fl = new Fail();
		fl.failExam(marks);
		System.out.println("Your GPA is " +total4);
                System.out.println("Congratulation You've passed the Exam");


	}
}
