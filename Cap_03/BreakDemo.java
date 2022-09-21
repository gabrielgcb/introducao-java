class BreakDemo {
	public static void main(String[] args) {

		int i;

		for(i = 0; i < 100; i++){
			if(i*i >= 100)
				break;
			System.out.println(i);	
		}

		System.out.println("Loop Complete.");
		
	}
}