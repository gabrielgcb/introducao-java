class GalToLitTable {
   public static void main(String[] args){
     double gallons, liters;
     int count = 0;
     for(gallons = 1; gallons < 100; gallons++){
	liters = gallons * 3.7854;
	System.out.println(gallons + " gallons is " + liters + " liters");
	count++;
	if(count > 9) { 
		System.out.println( );
		count = 0;
	}	
     }
   }
}