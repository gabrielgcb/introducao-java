class ForEach2 {
	public static void main(String[] args) {

		int[][] nums = new int[3][5];
		int i, j;

		for(i = 0; i < 3; i++) {
			for(j = 0; j < 5; j++) {
				nums[i][j] = (i+1) * (j+1);
			}
		}

		for(int x[] : nums) {
			for(int y : x){
				System.out.println("Value is " + y);
			}
		}
		
	}
}