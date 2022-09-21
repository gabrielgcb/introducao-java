class Help1 {	
	void helpOn(char what){
		switch(what){
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
				System.out.println("do{\n\tinstruções;");
				System.out.print("\n}");
				System.out.println(" while(condição);");
				break;
			case '6':
				System.out.println("comando break: ");
				System.out.println("break; ou break rótulo;");
				break;
			case '7':
				System.out.println("comando continue: ");
				System.out.println("continue; ou continue rótulo;");
				break;		
		}
		System.out.println();
	}

	void showMenu(){
		System.out.println("Help on: ");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do while");
		System.out.println("\t6. break");
		System.out.println("\t7. continue");
		System.out.println("\tpress 'q' to quit");
		System.out.println("Choose one");
	}

	boolean isValid(char choice){
		if(choice < '1' | choice > '7' & choice != 'q')
			return false;
		else
			return true;	
	}
}