import java.util.Scanner;
public class MatrixAdd{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("Please Enter the size of the matrix for addition\n");
		System.out.println("Please Enter the row size\n");
		int row = input.nextInt();
		System.out.println("Please Enter the column size\n");
		int col = input.nextInt();
		int[][] matrix = new int[col][row];
		int[][] matrix1 = new int[col][row];
		int[][] matrix2 = new int[col][row];
		System.out.println("\033[H\033[2J");
		System.out.println("Please Enter the First matrix:\n");
		for(int col1 = 0; col1 < matrix1.length; col1++){
		
			for(int row1 = 0; row1<matrix1[col1].length; row1++){
			
				matrix1[col1][row1] = input.nextInt();
				System.out.print("\t");
			}

			System.out.println();
		}
		System.out.println("\033[H\033[2J");
		System.out.println("Please Enter the Second Matrix:\n");
		for(int col1 = 0; col1 < matrix2.length; col1++){

                        for(int row1 = 0; row1<matrix2[col1].length; row1++){

                                matrix2[col1][row1] = input.nextInt();
				System.out.print("\t");
                        }

                        System.out.println();
                }

		System.out.println("\033[H\033[2J");
		System.out.println("*************You've Entered The Following Matrix*****************************\n");
		System.out.println("First matrix is as follow:-\n");
		for(int col1 = 0; col1 < matrix1.length; col1++){

                        for(int row1 = 0; row1<matrix1[col1].length; row1++){

                                System.out.print(matrix1[col1][row1]+"\t");
                        }

                        System.out.println("\n");
                }
		
		System.out.println("Second matrix is as follow:-\n");
		for(int col1 = 0; col1 < matrix2.length; col1++){

                        for(int row1 = 0; row1<matrix2[col1].length; row1++){

                                System.out.print(matrix2[col1][row1]+"\t");
                        }

                        System.out.println("\n");
                }

		for(int col1 = 0; col1 < matrix.length; col1++){

                        for(int row1 = 0; row1 < matrix1[col1].length; row1++){

                                matrix[col1][row1] = matrix1[col1][row1] + matrix2[col1][row1];
                        }
                }
		System.out.println("The sum of First Matrix and second Matrix are as follow:-");
		for(int col1 = 0; col1 < matrix.length; col1++){

                        for(int row1 = 0; row1<matrix[col1].length; row1++){

                                System.out.print(matrix[col1][row1] + "\t");
                        }

                        System.out.println("\n");
                }



	}
}
