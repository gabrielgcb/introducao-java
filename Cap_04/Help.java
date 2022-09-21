class Help {
	public static void main(String[] args) throws java.io.IOException {

		int choice;

		System.out.println("Help on: ");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("Choose one");

		System.out.print("\n");

		choice = 232;

		switch(choice){
			case 1:
				System.out.println("if(condição)");
				System.out.println("{\nsequência de instruções\n}");
				System.out.println("else");
				System.out.println("{\nsequência de instruções\n}");
				break;
			case 2:
				System.out.println("switch(expressão){");
				System.out.println("\tcase constante1:");
				System.out.println("\t\tsequência de instruções\n\t\tbreak");
				System.out.println("\tcase constante2:");
				System.out.println("\t\tsequência de instruções\n\t\tbreak");
				System.out.println("\tcase constante3:");
				System.out.println("\t\tsequência de instruções\n\t\tbreak");
				System.out.println("\t.\n\t.\n\t.");
				System.out.println("\tdefault");
				System.out.println("\t\tsequência de instruções\n}");
		}

	}
}