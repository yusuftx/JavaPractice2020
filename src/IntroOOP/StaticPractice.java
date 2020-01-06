package IntroOOP;

public class StaticPractice {

	public static String name;
	
	public static void main(String[] args) {
		
		StaticPractice obj1 = new StaticPractice();
		System.out.println(name);
	}
	
	static {
		name = "Suna";
	}
	public StaticPractice() {
		name = "Ahmet";
	}
	static {
		name = "Yusuf";
	}
}
