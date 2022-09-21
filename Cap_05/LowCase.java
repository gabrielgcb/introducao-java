/*
Transformar letras maiusculas em minusculas 
pela redefinicao do 6o bit com 1.
*/

class LowCase{
	public static void main(String[] args) {

		char ch;

		for(int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);

			ch = (char) (ch | 32);
			System.out.print(ch + " ");
		}

	}
}