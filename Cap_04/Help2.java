class Help2 {
	public static void main(String[] args) throws java.io.IOException {

		char choice, ignore;

		do{

			System.out.println("Help on: ");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t3. for");
			System.out.println("\t4. while");
			System.out.println("\t5. do while");
			System.out.println("Choose one");

			System.out.print("\n");

			choice = (char) System.in.read();

			do{
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while(choice < '1' || choice > '5');	


			switch(choice){
				case '1':
					System.out.println("if(condição)");
					System.out.println("{\nsequência de instruções\n}");
					System.out.println("else");
					System.out.println("{\nsequência de instruções\n}");
					break;
				case '2':
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
					break;
				case '3':
					System.out.println("for(inicialização; condição; iteração)");	
					System.out.println("{\nsequência de instruções\n}");
					break;
				case '4':
					System.out.println("while(condição) instrução;");	
					break;
				case '5':
					System.out.println("do{\ninstruções;");
					System.out.print("{\ninstruções;\n}");
					System.out.println(" while(condição);");
					break;						
			}

	}
}