package com.greatlearning.service;

public class OTPTest {

	public static void main(String[] args) {

		double otp = Math.random() * 9000 + 1000;

		System.out.println("\n Before Integer : " + otp);
		
		int generatedCorrectOTP = (int) otp;

		System.out.println("\n 4 Digit OTP: " + generatedCorrectOTP);
	}

}
