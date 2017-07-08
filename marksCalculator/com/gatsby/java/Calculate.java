package com.gatsby.java;

public class Calculate{
	private static int total = 0;
	private static int total1 = 0;
	private static int total2 = 0;
	private static int total3 = 0;
	public double marksCalculate(char[] marks){
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
		double total4 = total + total1 + total2 + total3 / marks.length;
		return total4;
	}
}
