class LengthDemo {
	public static void main(String[] args) {

		int[] list = new int[10]; 
		int[] nums = { 1, 2, 3 };
		int[][] table = { {7, 17, 27}, 
						  {37, 47, 57, 67},
						  {77, 87} };

		System.out.println("Tamanho de list: " + list.length);
		System.out.println("Tamanho de nums: " + nums.length);
		System.out.println("Tamanho de table: " + table.length);				 
		System.out.println("Tamanho de table[1]: " + table[1].length);
		System.out.println("Tamanho de table[2]: " + table[2].length);
		System.out.println();

		for(int i = 0; i < list.length; i++)
			list[i] = i * i;
		
		System.out.print("Valores da lista: ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");

	}
}