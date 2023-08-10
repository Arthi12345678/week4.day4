package week4.day4;

public class Automation extends MultipleLanguage {

	@Override
	public void java() {
		System.out.println("java");
		
	}

	@Override
	public void selenium() {
		System.out.println("selenium");
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	
		
	
	public static void main(String[] args) {
		Automation lang=new Automation();
		lang.java();
		lang.python();
		lang.ruby();
		lang.selenium();
	}

}
