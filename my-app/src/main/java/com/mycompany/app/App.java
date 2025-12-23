package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	private int tlf = 0;
	
	private String name;		
	private String surname;
	
    public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public static void main( String[] args )
    {
    	App app = new App(); 
    	app.setTlf(9);
        System.out.println( "Hello World! " + app.getTlf());
    }
}
