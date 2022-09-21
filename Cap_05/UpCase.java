/*
Transformar letras minusculas em maiusculas 
pela redefinicao do 6o bit com 0.
*/

class UpCase {
	public static void main(String[] args) {

		char ch;
		for(int i = 0; i < 26; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			ch = (char) (ch & 65503);
			System.out.print(ch + " ");
		}

	}
}