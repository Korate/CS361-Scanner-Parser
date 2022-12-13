public class ParserDemo {

	public static void main(String[] args) {

		// TO BE COMPLETED
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\Users\\13447\\Downloads\\AutumnClass\\CS361\\hw4\\CS361-Scanner-Parser\\prog1.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("Debugging - End of parsing");

	}

}