package week5.day2;

public class University extends College {

	public static void main(String[] args) {
		University obj = new University();
		obj.courses();
		obj.infrastructure();

	}

	@Override
	public void infrastructure() {
		System.out.println("Good Infrastructure");
	
	}

}
