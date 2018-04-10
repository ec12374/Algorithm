package FileIOConcepts;

import java.io.PrintWriter;

public class PrintConcepts {

	public static void main(String[] args) throws Exception {
		/*
		 * Constructors: PrintWriter pw= new PrintWriter(String filename);
		 * PrintWriter pw= new PrintWriter(File f); PrintWriter pw= new
		 * PrintWriter(Writer w);
		 * 
		 * Imp: PrintWriter can communicate directly or via some WriterObject
		 * also.Best writer object to use.
		 * 
		 * Write Methods: 1- write(int ch) 2- write(char[] ch) 3- write(String
		 * s) 4- flush() 5- close()
		 * 
		 * Print Methods: 1-print(char ch) 2- print(int i) 3- print(double d) 4-
		 * print(boolean b) 5- print(String s)
		 * 
		 * Println methods 1- println(char ch) 2- println(int i) 3-
		 * println(double d) 4- println(boolean b) 5- println(String s)
		 */

		PrintWriter pw = new PrintWriter("verify.txt");
		pw.write(100);
		pw.println(100);
		char[] ch1 = { 't', 'u', 's' };
		pw.write(ch1);
		pw.println();
		pw.println("Smile Please");
		pw.flush();
		pw.close();

	}

}
