class Primos{
	public static void main(String[] args){

		int numero;
		int divisor;
		int contador;

		for(numero = 2; numero <= 100; numero++){
			contador = 0;
			for(divisor = 1; divisor <= numero/2; divisor++){
				if(numero % divisor == 0)
					contador++;
			}
			if(contador <= 1)
				System.out.println("O número " + numero + " é primo.");
		}

	}
}