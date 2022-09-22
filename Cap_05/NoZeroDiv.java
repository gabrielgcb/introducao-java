//Impede uma divisao por zero usando o operador ?.

class NoZeroDiv{
	public static void main(String args[]) {

		int i, result;

		for(i = -5; i <= 5; i++) {
			result = (i != 0) ? 100 / i : 0;
			if(i != 0)
				System.out.println("100 / " + i + " = " + result);
		}

	}
}