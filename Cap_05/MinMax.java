class MinMax {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int i, max, min;

		nums[0] = 95; 
		nums[1] = 7;
		nums[2] = -9;
		nums[3] = 5;
		nums[4] = 45;
		nums[5] = 1000;
		nums[6] = 1500;
		nums[7] = -954;
		nums[8] = 777;
		nums[9] = 895;

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