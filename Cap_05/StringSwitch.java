class StringSwitch {
	public static void main(String[] args) {

		String command = "cancel";

		switch(command) {
			case "connected":
				System.out.println("Connecting");
				break;
			case "cancel":
				System.out.println("Cancelling");
				break;
			case "disconnect":
				System.out.println("Disconnecting");
				break;
			default:
				System.out.println("Command Error!");			
		}
		
	}
}