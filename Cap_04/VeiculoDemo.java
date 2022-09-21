class VeiculoDemo {
	public static void main(String[] args) {

		Veiculo minivan = new Veiculo();
		Veiculo esportivo = new Veiculo();

		minivan.passageiros = 7;
		minivan.capCombustivel = 100;
		minivan.consumo = 7.2;

		esportivo.passageiros = 2;
		esportivo.capCombustivel = 50;
		esportivo.consumo = 7.7;

		System.out.println("Dados Minivan: ");
		System.out.println("Passageiros: " + minivan.passageiros);
		System.out.println("Capacidade do tanque: " + minivan.capCombustivel);
		System.out.println("Consumo km/L: " + minivan.consumo);

		System.out.print("\n");

		System.out.println("Dados Esportivo: ");
		System.out.println("Passageiros: " + esportivo.passageiros);
		System.out.println("Capacidade do tanque: " + esportivo.capCombustivel);
		System.out.println("Consumo km/L: " + esportivo.consumo);

	}
}