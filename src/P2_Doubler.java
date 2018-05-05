/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_Doubler {

	public static void main(String[] args) {
// read a phrase from the user
		Scanner kb = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = nextLine();
		// read how many times
		System.out.print("How many times should I repeat it? ");
		int numTimes = nextInt ();
		//newline for formatting
		System.out.println();
		//iterate numTimes, printing phrase each time
		for(int i = 0; i < numTimes; i++)
			System.out.println(phrase);
	}

}
