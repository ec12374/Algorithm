package com.tus.Revision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoWrapper {

	public static void main(String[] args)throws IOException {

      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter a byte no. :");
      String s1= br.readLine();
      
      Byte b1= new Byte(s1);
      System.out.println(b1.toString());

	}

}
