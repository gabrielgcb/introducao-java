class MetToPol{
  	public static void main(String[] args){

    	double metros, polegadas;
    	int count = 0;

     	for(metros = 1; metros < 100; metros++){
			polegadas = metros * 39.37;
			System.out.println(metros + " metro(s) é " + polegadas + " polegadas");

			count++;

			if(count > 11) { 
					System.out.println( );
					count = 0;
			}	
     	}

   }
}