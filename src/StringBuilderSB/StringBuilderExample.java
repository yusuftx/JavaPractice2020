package StringBuilderSB;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Happy Birthday");
		System.out.println(sb);
		sb.append(" to you");
		System.out.println(sb);
		System.out.println("============================================");
		
		StringBuilder sb2 = new StringBuilder("Java");
		System.out.println(sb2);
		sb2.append(", SQL");
		System.out.println(sb2);
		sb2.append(", Selenium").append(",cucumber");
		System.out.println(sb2);
		System.out.println("============================================");
		
		// add by using append
		StringBuilder sb3 = new StringBuilder("Wooden Spoon");
		System.out.println(sb3);
		sb3.append("golden spoon");
		System.out.println(sb3);
		sb3.append('|');
		System.out.println(sb3);
		sb3.append(23);
		System.out.println(sb3);
		System.out.println("============================================");
		
		//add and delete
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.append("DEFG");
		System.out.println(sb4);
		sb4.delete(0, 3);
		System.out.println(sb4);
		System.out.println("============================================");
		
		//reverse and deleteCharAt
		StringBuilder sb5 = new StringBuilder("Java is Fun");
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5);
		sb5.deleteCharAt(sb5.length()-1);
		System.out.println(sb5);
		System.out.println("============================================");
		
		//insert
		StringBuilder sb6 = new StringBuilder("istanbul");
		System.out.println(sb6);
		sb6.insert(5, "_");
		System.out.println(sb6);
		System.out.println("============================================");
		
		StringBuilder sb7 = new StringBuilder("SeleniumAutomation");
		System.out.println(sb7);
		sb7.insert(8, " Test ");
		System.out.println(sb7);
		System.out.println("============================================");
		
		//replace
		StringBuilder sb8 = new StringBuilder("KeyBoard");
		System.out.println(sb8);
		sb8.replace(0, 3, "cutting");
		System.out.println(sb8);
		System.out.println("============================================");
		
		String str = "aabbccaaddccbb";
		System.out.println(str);
		str = str.replace("aa", "ww");
		System.out.println(str);
		str = str.replaceFirst("ww", "mm");
	    System.out.println(str);
	    System.out.println("=======================================");
	    
	    StringBuilder sb9 = new StringBuilder("java");
	    StringBuilder sb10 = new StringBuilder("Java");
	    
	    System.out.println(sb9 == sb10); // it is false
	    System.out.println(sb9.equals(sb10)); // it is also false
	    
	    // to make them equal, convert to string
	   boolean isEqual = sb9.toString().equals(sb10.toString());
	   System.out.println(isEqual);
	}

}
