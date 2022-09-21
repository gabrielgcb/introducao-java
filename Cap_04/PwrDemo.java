class Pwr {
	int base;
	int expoente;
	int valor;

	Pwr(int b, int exp) {
		this.base = b;
		this.expoente = exp;

		this.valor = 1;
		if(exp == 0)
			return;
		for( ; exp > 0; exp--)
			this.valor = this.valor * b;
	}

	int get_pwr() {
		return valor;
	}
}

class PwrDemo {
	public static void main(String[] args) {

		Pwr teste1 = new Pwr(2, 3);
		Pwr teste2 = new Pwr(4, 5);
		Pwr teste3 = new Pwr(5, 0);

		System.out.println(teste1.base + "^" + teste1.expoente + " = " + teste1.get_pwr());
		System.out.println(teste2.base + "^" + teste2.expoente + " = " + teste2.get_pwr());
		System.out.println(teste3.base + "^" + teste3.expoente + " = " + teste3.get_pwr());

	}
}