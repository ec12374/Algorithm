package FileIOConcepts;

import java.io.*;

public class MergeTwoFiles {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("mixed.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("verify.txt"));

       String line= br.readLine();
		while (line != null) {
			pw.println(line);
			line= br.readLine();
		}
		//br.close();
		br= new BufferedReader(new FileReader("aivehi.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			line= br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
