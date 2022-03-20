package week5.day2;

public class MyBank extends SBI {

	public static void main(String[] args) {
		MyBank bank = new MyBank();
		bank.openAccount();
		bank.provideDebitCard();
		bank.provideCreditCard();
		//call interface methods
		RBI rbi = new MyBank();
		rbi.openAccount();
		rbi.provideDebitCard();

	}

}
