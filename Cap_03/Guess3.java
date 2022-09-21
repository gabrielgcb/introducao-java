class Guess3 {
	public static void main(String[] args) throws java.io.IOException {

		char resposta = 'G';
		char letra;
		char ignore;

		do {
			System.out.print("Informe uma letra, após pressione a tecla ENTER: ");

			letra = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');

			if(letra == resposta)
				System.out.println("Resposta correta!");
			else {
				System.out.println("Resposta errada!");
				if(letra > resposta)
					System.out.println("Palpite alto...");
				else
					System.out.println("Palpite baixo...");
			}

		} while(letra != resposta);

	}
}