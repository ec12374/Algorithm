package FileIOConcepts;

import java.io.*;

public class FileMethods {

	public static void main(String[] args) throws IOException {

		// File
		File f = new File("verify.txt");
		System.out.println(f.exists());
		// f.createNewFile();
		System.out.println(f.isFile());

		// Directory
		File f1 = new File("Verify");
		System.out.println(f1.exists());

		File f3 = new File(f1, "input1.txt");
		f3.createNewFile();

		File f4 = new File(f1, "input2.txt");
		f4.createNewFile();

		File f5 = new File(f1, "input3.txt");
		f5.createNewFile();

		File f6 = new File(f1, "input4.txt");
		f6.createNewFile();
		// f1.mkdir();

		// to check all list of files and directories in current working
		// directory
		/*
		 * File checklist = new File("D:\\MyJavaPrograms\\BasicConceptsAll");
		 * String[] all = checklist.list(); for (String s : all) { File fn = new
		 * File(checklist, s); if (fn.isDirectory()) {// or isFile()
		 * System.out.println(s); } }
		 */

		// FileWriter
		// It will override the data
		// FileWriter fw= new FileWriter("verify.txt");

		// This below function will append the data
		/*
		 * FileWriter fw = new FileWriter("verify.txt", true); // file writer
		 * has five methods. fw.write("Hii... i m here");// 1 fw.write(100);// 2
		 * char[] ch = { 'a', 'b', 'c' }; fw.write(ch);// 3 fw.flush();// 4
		 * fw.close();// 5
		 */

		// 
		FileReader fr = new FileReader("verify.txt");
		int i = fr.read();// return type is int
		while (i != -1) {// if nothing to read then it will return -1
			System.out.print((char) i);
			i = fr.read();
		}
		fr.close();
		
		// using char type method
		FileReader fr1=new FileReader("verify.txt");
		// length return type is long
		char[] ch1=new char[(int)f.length()];
		fr1.read(ch1);
		for(char ch2:ch1){
			System.out.print(ch2);
		}
		fr1.close();
		
	}

}
