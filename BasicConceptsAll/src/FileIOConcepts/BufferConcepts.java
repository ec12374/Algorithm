package FileIOConcepts;

import java.io.*;

public class BufferConcepts {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("verify.txt");
		// It is the best reader... because read line by line
		// in spite of character by character
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

		FileWriter fw = new FileWriter("verify.txt");
		// It reads character by character
		// only importance, it has separate new line method
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(97);
		bw.newLine();
		char[] ch1 = { 'b', 'r', 'a', 'i', 'n' };
		bw.write(ch1);
		bw.write("storming");
		bw.flush();
		bw.close();
	}
}
