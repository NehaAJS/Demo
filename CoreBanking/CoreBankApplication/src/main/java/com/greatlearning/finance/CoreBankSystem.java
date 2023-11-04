package com.greatlearning.finance;

import java.util.Scanner;

public class CoreBankSystem {

	static int generatedOTPFromSystem() {
		return (int) (Math.random() * 9000 + 1000);
	}

	public static void main(String[] args) {

		String customerAccountNumber = "12345";

		String customerPassword = "pass";

		int accountBalance = 1000;

		int amount, choice, otp, generatedOTP, custAccNo;

		Scanner scanner = new Scanner(System.in);
		boolean status;

		do {

			System.out.println("\n Please enter Customer Account Number And Password: ");

			String accNumber = scanner.nextLine();
			String custPass = scanner.nextLine();

			if (customerAccountNumber.equals(accNumber) && customerPassword.equals(custPass)) {
				System.out.println("\n Welcome to Indian Bank!!!");
				status = false;

			} else {
				System.out.println("\n Invalid Credentials, Please try again!!!!");
				status = true;
			}

		} while (status);
		status = true;
		do {

			System.out.println("\n Please enter your choice: \n 1. Deposit \n 2. Withdraw \n 3. Transfer \n 4. Logout");

			choice = scanner.nextInt();

			switch (choice) {
			case 1: // Deposit

				System.out.println("\n Please enter amount for Deposit: ");
				amount = scanner.nextInt();

				accountBalance = accountBalance + amount;

				System.out.println("\n Amount Deposited Successfully");
				System.out.println("\n Account Balance: " + accountBalance);

				break;

			case 2: // Withdraw

				System.out.println("\n Please enter amount for Withdraw: ");

				amount = scanner.nextInt();
				if (accountBalance > amount) {

					accountBalance = accountBalance - amount;

					System.out.println("\n Amount Withdraw Successfully");
					System.out.println("\n Account Balance after Withdraw: " + accountBalance);

				} else {

					System.out.println("\n Insufficient Fund");

				}

				break;

			case 3: // Transfer

				System.out.println("\n Please enter Account Number & Amount for Transfer: ");

				custAccNo = scanner.nextInt();
				amount = scanner.nextInt();

				otp = generatedOTPFromSystem();

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

				break;

			case 4: // Logout

				status = false;

				System.out.println("\n Logout Successfully");

				break;
			default:
				System.out.println("\n Invalid Choice, Please try with correct one");
				break;
			}
		} while (status);
	}

}
