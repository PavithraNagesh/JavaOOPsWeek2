package week5.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.ruby();
		auto.Selenium();

	}

	@Override
	public void ruby() {
		System.out.println("Ruby is also Programming language");
		
	}

	public void Selenium() {
		System.out.println("Selenium is Test Tool");
		
	}

	public void Java() {
		System.out.println("Java Programming Language");
		
	}

}
