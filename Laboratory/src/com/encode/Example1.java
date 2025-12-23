package com.encode;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Example1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		//String message = "FUNESPAÑA";
		
		byte[] message1 = {70, 85, 78, 69, 83, 80, 65, -61, -125, -62, -111, 65};		                  
		
		
		String cadena = new String(message1, "UTF-8");
		
		System.out.println(new String(message1, "UTF-8"));	
		System.out.println(new String(message1, "ISO-8859-1"));
		System.out.println(new String(message1, "ISO-8859-2"));
		System.out.println(new String(message1, "Windows-1250"));
		System.out.println(new String(message1, "Windows-1252"));
		System.out.println(cadena);
		
		new PrintStream(System.out, true, "UTF-8").println("1000 ã•ãã‚‰  Ñ");
		
//		System.out.println(message.getBytes("UTF-8"));		
//		String value = new String(message.getBytes("UTF-8"), "UTF-8"); 
		
//		System.out.println(value);
//		System.out.println(message);

	}

}
