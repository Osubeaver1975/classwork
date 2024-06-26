package com.frank;

public class DemoStartProgram {
	
	/***********************************************************************
	 * main() is the starting point for all java apps
	 * 
	 * In this application structure:
	 * 
	 * `1. The actual application program is in a different class than main
	 * 	2. What main() does:
	 * 		a. Instantiates an object representing the application program
	 * 		b. Use that object to call the method that runs the application
	 * 
	 **********************************************************************/
	
	
	public static void main(String[] args) {
		
		// Instantiate an object representing the app program
		SampleJDBCApplication theSampleApp = new SampleJDBCApplication();
		
		// Use that object to call the method that runs the application
		theSampleApp.run();				
	}

}
