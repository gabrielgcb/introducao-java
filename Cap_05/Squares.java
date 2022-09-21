class Squares {
	public static void main(String[] args) {

		int[][] squares = {{1, 2}, 
						   {2, 4},
						   {3, 9},
						   {4, 16},
						   {5, 25}};

		int i, j;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 2; j++) {
				System.out.print(squares[i][j] + " ");
			}
			System.out.println();
		}				   

	}
}