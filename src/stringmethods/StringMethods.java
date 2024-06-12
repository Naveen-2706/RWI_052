package stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Railworld";
		String str2="Pvt.Ltd";
		String str3="236";
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("Concatenation : "+str1.concat(str2));
		System.out.println("CharAt : "+str1.charAt(5));
		System.out.println("indexOf : "+str1.indexOf("d"));
		System.out.println("compareTo : "+str1.compareTo(str2));
		System.out.println("Length : "+str1.length());
		System.out.println("equals : "+str1.equals(str2));
		System.out.println("substring with only starting index : "+str1.substring(4));
		System.out.println("sunstring with start and end indexes : "+str1.substring(4,6));
		System.out.println("startsWith : "+str1.startsWith("R"));
		System.out.println("endsWith : "+str1.endsWith("d"));
		System.out.println("toUpperCase : "+str1.toUpperCase());
		System.out.println("toLowerCase : "+str2.toLowerCase());
		System.out.println("contains : "+str1.contains("lwor"));
		//System.out.println("toString : "+str1.toString());
		
		
		
		
		
		
		
		
		
	}

}
