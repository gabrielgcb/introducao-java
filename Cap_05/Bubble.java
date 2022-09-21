class Bubble {
	public static void main(String[] args) {

		int[] nums = { 95, 7, -9, 5, 45, 
					  -87, 569, 777, -6, -800 };

		int i, j, aux;
		
		System.out.println("Original array: ");

		for(i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");			
		System.out.println();

		for(i = 0; i < nums.length; i++) {
			for(j = i+1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					aux = nums[i];
					nums[i] = nums[j];
					nums[j] = aux;
				}
			}
		}

		System.out.println("Sorted array: ");

		for(i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");			
		System.out.println();

	}
}