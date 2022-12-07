package main;

import lib.EmailVerification;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		EmailVerification newEmail = new EmailVerification();

		System.out.println("Welcome to Facebook");
		String welcome = "Create account or Login";
		System.out.println(welcome);

		Scanner input = new Scanner(System.in);
		String acc = input.nextLine().toLowerCase();
		if (acc.equals("create account")) {
			newEmail.newEmail();
			newEmail.newPassword();
		} else if (acc.equals("login")) {
			newEmail.loginEmail();
			newEmail.loginPassword();
		}

		
	}
}
