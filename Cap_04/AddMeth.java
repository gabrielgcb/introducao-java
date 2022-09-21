class AddMeth {
	public static void main(String[] args) {

		Veiculo minivan = new Veiculo();

		minivan.passageiros = 8;
		minivan.capCombustivel = 100;
		minivan.consumo = 7.2;

		System.out.println("Quantidade de passageiros: " + minivan.passageiros);

		minivan.exibirAutonomia();

	}
}