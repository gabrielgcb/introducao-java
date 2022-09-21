class ForVar {
	public static void main(String[] args) {
		
		int soma = 0;
		int fatorial = 1;

		for(int i = 1; i <= 5; i++){
			soma += i;
			fatorial *= i;
		}

		System.out.println("Soma: " + soma + "\nFatorial: " + fatorial);
	}
}