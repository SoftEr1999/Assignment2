
public class MatrixTransposeMultiplicationElement {

	public static void main(String[] args) {
		
		//Initializing and declaring the matrix 3*2
		int [][]mat = new int[][] { {1,2}, {4,5}, {8,9}};
		
		transposeMatrix(mat); // Calling of method for transpose of matrix
		
		elementMultiplication(mat); // Calling of method to Multiply all elements present in matrix

	}
	
	// Declaration and Defining the trasposeMatrix method
	static void transposeMatrix(int [][]mat)
	{
		int b[][] = new int[2][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j] = mat[j][i];
			}
		
		}
		
		//Printing transposed matrix
		
		System.out.println("Matrix after Transpose:\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
					System.out.print(b[i][j]+" ");
				
				
			}
			System.out.println();
		
		}
	}
	
	// Declaration and Defining the elementMultiplication method
	static void elementMultiplication(int [][]mat)
	{
		int mul = 1; //Initializing mul variable to 1
		
		//logic to multiply element of matrix
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				mul *= mat[i][j]; //Assigning multiplied value
			}
		}
		// Printing the mul variable value
		System.out.println("\nMatrix all element multiplication is:"+mul);
	}

}
