// Demonstra o NOT bitwise.

class NotDemo {
	public static void main(String[] args) {

		byte b = 89;

		for(int t = 128; t > 0; t /= 2) {
			if((b & t ) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");	
		}

		System.out.println();

		b = (byte) ~b;

		for(int t = 128; t > 0; t /= 2) {
			if((b & t ) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");	
		}
	}
}