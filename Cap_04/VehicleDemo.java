class Vehicle {
	int passageiros;
	int capCombustivel;
	double consumo;
}

class VehicleDemo {
	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();

		minivan.passageiros = 7;
		minivan.capCombustivel = 100;
		minivan.consumo = 7.2;

		System.out.println("Passageiros: " + minivan.passageiros);
		System.out.println("Capacidade do tanque: " + minivan.capCombustivel);
		System.out.println("Consumo km/L: " + minivan.consumo);

	}
}