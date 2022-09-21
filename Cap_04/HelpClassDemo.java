class HelpClassDemo {
	public static void main(String[] args) throws java.io.IOException {

		char choice, ignore;

		Help1 helpobj = new Help1();

		for(;;){
			do{
				helpobj.showMenu();
				
				choice = (char) System.in.read();

				do{
					ignore = (char) System.in.read();
				}while(ignore !='\n');

			}while(!helpobj.isValid(choice));

			if(choice == 'q')
				break;

			System.out.println("\n");
			
			helpobj.helpOn(choice);		
		}
		System.out.println("You pressed 'q'");

	}
}
