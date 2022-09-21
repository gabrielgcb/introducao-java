class MinMax2 {
	public static void main(String[] args) {

		int[] nums = { 95, 7, -9, 5, 45, 
					  -87, 569, 777, -6, -800 };

		int i, max, min;

		max = min = nums[0];

		for(i = 1; i < 10; i++) {
			if(nums[i] > max)
				max = nums[i];
			if(nums[i] < min)
				min = nums[i];	
		}

		System.out.println("min and max, respectively: " + min + " " + max);

	}
}