
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// Oh! This needs to be changed !
	private static String file1 = "C:\\Users\\13447\\Downloads\\AutumnClass\\CS361\\hw4\\CS361-Scanner-Parser\\prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk;
		while (!ts.isEndofFile()) {
			// TODO TO BE COMPLETED
			// tk is not defined on the line below
			tk=ts.nextToken();
			 System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
