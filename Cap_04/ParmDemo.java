class ParmDemo {
	public static void main(String[] args) {

		ChkNum numero = new ChkNum();

		if(numero.isEven(10))
			System.out.println("10 é par");
		if(numero.isEven(9))
			System.out.println("9 é par");
		if(numero.isEven(8))
			System.out.println("8 é par");

	}
}