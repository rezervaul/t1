package bankomat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

	public void start() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your PIN code");
		try {
			String PIN = bf.readLine();

			if (PIN.equals(UserAccount.getPIN())) {
				WorkWithAccount();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	private void WorkWithAccount() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You have " + UserAccount.getAmount() + " Hrivnas");
		System.out.println("What amount of money do you whant to get?");
		try {
			int a = Integer.parseInt(bf.readLine());
			if (a <= UserAccount.getAmount()) {
				UserAccount.setAmount(UserAccount.getAmount() - a);
			}
			System.out.println(UserAccount.getAmount() + " Hrivnas left");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
