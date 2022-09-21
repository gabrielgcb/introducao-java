class Break3 {
	public static void main(String[] args) {

		int i = 0, t;

		while(i < 10){
			System.out.println("Laço de fora: " + i);
			for(t = 0; t < 100; t++){
				if(t == 10)
					break;
				System.out.print(" " + t);
				System.out.print(" ");
			}
			System.out.print("\n");	
			i++;
		}

		System.out.println("\nLoop completo.");

	}
}