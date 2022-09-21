class KbIn {
	public static void main(String[] args) throws java.io.IOException {

		char ch;

		System.out.print("Digite um caracter, após pressione a tecla ENTER: ");

		ch = (char) System.in.read();

		System.out.println("Caracter digitado: " + ch);
	}
}