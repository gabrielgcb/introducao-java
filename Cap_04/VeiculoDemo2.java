class VeiculoDemo2 {
	public static void main(String[] args) {

		Veiculo2 minivan = new Veiculo2(7, 100, 7.2);
		Veiculo2 esportivo = new Veiculo2(2, 50, 7.7);

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