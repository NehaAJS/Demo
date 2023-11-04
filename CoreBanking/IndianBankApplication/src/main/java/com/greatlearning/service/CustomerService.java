package com.greatlearning.service;

import java.util.Scanner;

public class CustomerService {

	int accountBalance = 1000, amount, custAccNo, otp, generatedOTP;

	OTPGenerator otpGenerator = new OTPGenerator();

	Scanner scanner = new Scanner(System.in);

	public void deposit() {
		System.out.println("\n Please enter amount for Deposit: ");
		amount = scanner.nextInt();

		accountBalance = accountBalance + amount;

		System.out.println("\n Amount Deposited Successfully");
		System.out.println("\n Account Balance: " + accountBalance);

	}

	public void withdraw() {
		System.out.println("\n Please enter amount for Withdraw: ");

		amount = scanner.nextInt();
		if (accountBalance > amount) {

			accountBalance = accountBalance - amount;

			System.out.println("\n Amount Withdraw Successfully");
			System.out.println("\n Account Balance after Withdraw: " + accountBalance);

		} else {

			System.out.println("\n Insufficient Fund");

		}

	}

	public void transfer() {

		System.out.println("\n Please enter Account Number & Amount for Transfer: ");

		custAccNo = scanner.nextInt();
		amount = scanner.nextInt();

		otp = otpGenerator.generatedOTPFromSystem();

		System.out.println("OTP: " + otp);
		System.out.println("\n Please enter OTP: ");

		generatedOTP = scanner.nextInt();

		if (otp == generatedOTP) {

			if (accountBalance > amount) {

				accountBalance = accountBalance - amount;

				System.out.println("\n Amount Transfer Successfully");
				System.out.println("\n Account Balance after Transfer: " + accountBalance);

			} else {

				System.out.println("\n Insufficient Fund");

			}

		} else {
			System.out.println("\n Invalid OTP, Please Try Again!!!");
		}

	}
}
