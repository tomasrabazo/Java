package com;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8080/HiQRegistrationWeb/fi/registration/step-3-success";
		
		url = url.replaceAll("localhost", "192.168.1.1");
		
		System.out.println(url);
	}

}
