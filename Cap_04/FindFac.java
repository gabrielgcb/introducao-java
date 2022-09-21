class FindFac {
	public static void main(String[] args) {

		int i, j;

		for(i = 2; i <= 100; i++){
			System.out.print("Factors of " + i + ": ");
			for(j = 2; j <= i/2; j++){
				if(i % j != 0)
					continue;
				System.out.print(j + " ");	
			}
			System.out.print("\n");
		}
		
	}
}