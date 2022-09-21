class IsFac {
	public static void main(String[] args) {

		Factor num = new Factor();

		if(num.isFactor(5, 10))
			System.out.println("5 é fator de 10");
		if(num.isFactor(11, 12))
			System.out.println("12 é fator de 11");	

	}
}