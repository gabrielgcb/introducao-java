class DWDemo {
	public static void main(String[] args) throws java.io.IOException {

		char ch, ignore;

		do {
			System.out.print("Press a key followed by ENTER: ");
			ch = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
				System.out.println("Opa");
			} while(ignore != '\n');

		} while(ch != 'q');

	}
}