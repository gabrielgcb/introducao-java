class Veiculo {
	int passageiros;
	int capCombustivel;
	double consumo;

	double calcularAutonomia(){
		return capCombustivel * consumo;
	}
}

