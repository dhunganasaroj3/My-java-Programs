package com.gatsby.java;

public class Fail{

	public void failExam(char[] marks){
	
		for (int i = 0; i < marks.length; i++){

                        if(marks[i] == 'F' || marks[i] == 'f'){

                                System.out.println();
				System.out.println("********************Sorry*******************");
                                System.out.println("You have Failed the Exam");
				System.exit(1);
   			}
	}  
}
}
