class ShowBits {
	public static void main(String[] args) {

		byte valor = 123;
		int t;

		for(t = 128; t > 0; t /= 2) {
			if((valor & t) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");	
		}

	}
}