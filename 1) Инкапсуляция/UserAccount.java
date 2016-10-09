package bankomat;

public class UserAccount {

	private static String PIN = "1111";
	private static int amount = 5000;

	public static  String getPIN() {
		return PIN;
	}

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int moneyAmount) {
		amount = moneyAmount;
	}

}
