class Encode {
	public static void main(String[] args) throws java.io.IOException {

		System.in.read();

		String msg = "Eu sou Optimus Prime e envio esta mensagem a todos os autobots: bora trenin.";

		String msg_cod = "";
		String msg_dec = "";
		int key = 95;

		int i;

		for(i = 0; i < msg.length(); i++) {
			msg_cod = msg_cod + (char) (msg.charAt(i) ^ key);
		}
		System.out.println("\n\tMENSAGEM CODIFICADA: \n" + msg_cod);
		System.out.println();

		for(i = 0; i < msg.length(); i++) {
			msg_dec = msg_dec + (char) (msg_cod.charAt(i) ^ key);
		}
		System.out.println("\tMENSAGEM DECODIFICADA: \n" + msg_dec);
	}
}