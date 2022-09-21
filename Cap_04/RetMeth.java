class RetMeth {
	public static void main(String[] args) {

		Veiculo minivan = new Veiculo();

		double autonomia;

		minivan.passageiros = 8;
		minivan.capCombustivel = 100;
		minivan.consumo = 7.2;

		System.out.println("Quantidade de passageiros: " + minivan.passageiros);

		autonomia = minivan.calcularAutonomia();

		System.out.println("A autonomia é de: " + autonomia);

	}
}