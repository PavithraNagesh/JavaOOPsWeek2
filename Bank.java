package week5.day2;

public class Bank extends SBI1 implements CIBIL,PNB {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.bankBalance();
		bank.minimumBalance();
		bank.maximumLoanAmount();
		bank.cibilScore();
		bank.creditScore();
		bank.ITLoan();
		
	}

	public void creditScore() {
		
		System.out.println("Credit Score : 150");
	}

	public void minimumBalance() {
		System.out.println("Minimum Balance : 10000");
		
	}

	public void cibilScore() {
		System.out.println("CIBIL Score : 550");

	}

	@Override
	public void bankBalance() {
		System.out.println("Bank Balance : 500000");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("Maximum Loan Amount : 1000000");
		
		
	}

}
