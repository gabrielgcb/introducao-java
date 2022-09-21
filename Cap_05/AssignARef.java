class AssignARef {
	public static void main(String[] args) {

		int[] nums1 = new int[10];
		int[] nums2 = new int[10];
		
		int i;

		for(i = 0; i < nums1.length; i++)
			nums1[i] = i;

		for(i = 0; i < nums2.length; i++)
			nums2[i] = -i;

		System.out.println("Numeros da lista 1: ");
			for(i = 0; i < nums1.length; i++)
				System.out.print(nums1[i] + " ");
			System.out.println();

		System.out.println();	
			
		System.out.println("Numeros da lista 2: ");
			for(i = 0; i < nums2.length; i++)
				System.out.print(nums2[i] + " ");
			System.out.println();

		System.out.println();	

		nums2 = nums1;
		
		System.out.println("Numeros da lista 2 após de atribuir nums1 a nums2: ");
			for(i = 0; i < nums2.length; i++)
				System.out.print(nums2[i] + " ");
			System.out.println();

		System.out.println();	

		nums2[3] = 777;
		
			System.out.println("Numeros da lista 2: ");
			for(i = 0; i < nums2.length; i++)
				System.out.print(nums2[i] + " ");
			System.out.println();	

		System.out.println();	

	}
}