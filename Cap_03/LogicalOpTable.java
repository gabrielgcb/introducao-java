class LogicalOpTable {

	boolean p, q;

	System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

	p = true; q = true;
	System.out.println(p + "\t" + q + "\t" + 
					  (p & p) + "\t" + 
					  (p | p) + "\t" + 
					  (p ^ p) + "\t" +
					  (!p));

}