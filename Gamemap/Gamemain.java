import com.gatsby.java.*;
import java.util.*;

public class Gamemain{

	public static void main(String[] args){
	System.out.println("****************************GAME ENGINE*******************************");
	System.out.println("Press Enter the following number to Perform Action");
	System.out.println("1. up");
	System.out.println("2. down");
	System.out.println("3. right");
	System.out.println("4. left");
	try{
	Scanner input = new Scanner(System.in);
	int val1 = input.nextInt();
	String hell = "";
	Game obj = new Game();
	if(val1 == 1 || val1 == 2 || val1 == 3 || val1 == 4){

	switch(val1)
	{
		case 1:
			{
				hell = obj.up();
				break;
			}
		case 2:
			{
				hell = obj.down();
				break;
			}
		case 3:
			{
				hell = obj.right();
				break;
			}
		default:
			{
				hell = obj.left();
				break;
			}
	}
	}
	else{
		System.out.println("Please Enter the Correct Number!!! Last Try :(");
	val1 = input.nextInt();
		
		switch(val1)
		{
		
			case 1:
				{
				hell = obj.up();
				break;
				}
			case 2:
				{
				hell = obj.down();
				break;
				}
			case 3:
				{
				hell = obj.right();
				break;
				}
			case 4:
				{
				hell = obj.left();
				break;
				}
			default:
				{
				System.out.println("You Have Entered twice a Wrong Number!!!!");
				System.out.println("*****************Program is Halting**********************");
				System.exit(1);
				}
		}
	}
	System.out.println(hell);
	}catch(Exception e){
                System.out.println("************Please Enter the correct Number**************");
                System.out.println("The generated Exception is :-  "+e);
        }

	}
}
