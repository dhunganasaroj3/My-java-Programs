package com.gatsby.java;
import java.util.*;

public class charInput{

	public static char[] Main(int val){
	
		Scanner input = new Scanner(System.in);
		char[] marks = new char[val];
		for(int i = 0; i < marks.length; i++){
		
			marks[i] = input.next().charAt(0);

			if(marks[i] == 'a' || marks[i] == 'b' || marks[i] == 'c' || marks[i] == 'd' || marks[i] == 'f' || marks[i] == 'A' || marks[i] == 'B' || marks[i] == 'C' || marks[i] == 'D' || marks[i] == 'F'){
				continue;
			}
			else{
			System.out.println("Please enter the correct marks");
			System.out.println("You only have single try left");
			marks[i] = input.next().charAt(0);

			}
		}
		System.out.println("You've entered the following Marks respectively");
		for (char value : marks){

                        System.out.println(value);
                }
		return marks;
		}
	}
