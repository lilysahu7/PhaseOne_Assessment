package com.application;

import com.outputmessages.OutputScreen;


public class Application {

	public static void main(String[] args) {
		OutputScreen os = new OutputScreen();
		os.mainScreen();
		
		if (os.loginScreen()) {
			os.functionalityOptions();
		}
	}

}
