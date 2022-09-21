class Guess {
	public static void main(String[] args) throws java.io.IOException {

		char resposta = 'G';
		char letra;

		System.out.print("Informe uma letra, após pressione a tecla ENTER: ");

		letra = (char) System.in.read();

		if(letra == resposta)
			System.out.println("Resposta correta!");
		else
			System.out.println("Resposta errada!");
	}
}