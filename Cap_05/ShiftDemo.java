//Demonstra os operadores de deslocamento << e >>.

class ShiftDemo {
	public static void main(String[] args) {

		int val = 1;

		for(int q = 0; q < 8; q++){
			for(int t = 128; t > 0; t/=2) {
				if((val & t) != 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");	
			}
			System.out.println();

			val = val << 1;	
		}

		System.out.println();

		val = 128;

		for(int q = 0; q < 8; q++){
			for(int t = 128; t > 0; t/=2) {
				if((val & t) != 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");	
			}
			System.out.println();

			val = val >> 1;	
		}

			
	}
}