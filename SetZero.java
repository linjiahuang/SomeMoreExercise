public class SetZero{
	public static void setZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for(int i = 0; i < matrix.length; i++){
			if(row[i]){
				nullifyRow(matrix, i);
				System.err.println(i);
			}
				
		}

		for(int i = 0; i < matrix[0].length; i++){
			if(column[i]){
				nullifyColumn(matrix, i);
				System.err.println(i);
			}
				
		}
	}

	private static void nullifyRow(int[][] matrix, int i){
		for(int j = 0; j < matrix[0].length; j++){
			matrix[i][j] = 0;
		}
	}

	private static void nullifyColumn(int[][] matrix, int i){
		for(int j = 0; j < matrix.length; j++){
			matrix[j][i] = 0;
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
		int[][] matrix = {{1, 0, 6},{2, 5, 8},{0, 5, 9}};
		printMatrix(matrix);
		setZero(matrix);
		printMatrix(matrix);
	}
}