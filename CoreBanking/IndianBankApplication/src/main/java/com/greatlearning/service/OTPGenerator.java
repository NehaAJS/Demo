package com.greatlearning.service;

public class OTPGenerator {
	
	int generatedOTPFromSystem() {
		return (int) (Math.random() * 9000 + 1000);
	}

}
