import java.lang.Math;

public class RotateMatrix{
	public static void rotateMatrix(int[][] matrix){
		int n = matrix.length;

		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - first;

			//System.err.println(layer);

			for(int index = layer; index < last; index++){
				int offset = last - index;

				System.err.println(index);

				int top = matrix[layer][index];
				matrix[layer][index] = matrix[layer + offset][layer];
				System.err.println(index);
				matrix[layer + offset][layer] = matrix[n - 1 - layer][layer + offset];
				System.err.println(matrix[layer + offset][layer]);
				matrix[n - 1 - layer][layer + offset] = matrix[layer][n - layer - 1];
				System.err.println(index);
				matrix[layer][n - layer - 1] = top;
			}
		}
	}

	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8 ,9}};
		printMatrix(matrix);
		rotateMatrix(matrix);
		printMatrix(matrix);
	}
}