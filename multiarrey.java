
public class multiarrey{

	public static void main(String[] args){
	
		//int[][] var = new int[3][3];
		int[][] var = {{1,2,3},{4,5,6},{7,8,9}};
		for(int col = 0; col<var.length; col++){
		
			for(int row = 0; row<var[col].length; row++){
			
				System.out.print(var[col][row]+"\t");
			}
			System.out.println("\n");
		}
	}
} 
