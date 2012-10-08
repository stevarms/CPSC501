public class mainrun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SWN3 myswn = new SWN3();
		//myswn.printAll();
		String test = myswn.extract("landscape","n");
		System.out.println(test);
	}

}
