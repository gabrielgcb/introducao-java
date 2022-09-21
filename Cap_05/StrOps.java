class StrOps {
	public static void main(String[] args) {

		String str1 = "When it comes to Web programming, Java is #1";
		String str2 = new String(str1);
		String str3 = "Java strings are powerful";

		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else
			System.out.println("str1 aren't equals str2");

		System.out.println("Length of str1: " + str3.length());

		for(int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}

		System.out.println();
		
		System.out.println(str3.compareTo(str1));

		System.out.println(str1.lastIndexOf("Java"));		

	}
}