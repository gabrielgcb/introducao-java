class Search {
	public static void main(String[] args) {

		int[] nums = { 5, 3, 6, 9, 8, 5, 2, 88, 54, 51, 99, 54, 89, 21, 15};
		int val = 88;
		boolean found = false;

		for(int x : nums) {
			System.out.println(x);
			if(x == val) {
				found = true;
				break;
			}
		}

		System.out.println("Value 88 have been found!");

	}
}