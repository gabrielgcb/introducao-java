class Power {
	public static void main(String[] args) {

		int numero = 2;
		int potencia;
		int quantidade;
		int resultado;

		for(potencia = 1; potencia <= 10; potencia++){
			quantidade = 1;
			resultado = 1;
			while(quantidade <= potencia){
				resultado *= numero;
				quantidade++;
			}
			System.out.println("2^" + potencia + " = " + resultado);
		}
	}
}