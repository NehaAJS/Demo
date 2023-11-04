package com.greatlearning.controller;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.CustomerService;

public class CustomerController {

	public static void main(String[] args) {

		Customer customer = new Customer("12345", "pass");

		int choice;

		Scanner scanner = new Scanner(System.in);
		boolean status;

		CustomerService customerService = new CustomerService();

		do {

			System.out.println("\n Please enter Customer Account Number And Password: ");

			String accNumber = scanner.nextLine();
			String custPass = scanner.nextLine();

			if (customer.getCustAccountNumber().equals(accNumber) && customer.getCustPassword().equals(custPass)) {
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

				customerService.deposit();

				break;

			case 2: // Withdraw

				customerService.withdraw();
				break;

			case 3: // Transfer

				customerService.transfer();
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

		scanner.close();

	}

}
