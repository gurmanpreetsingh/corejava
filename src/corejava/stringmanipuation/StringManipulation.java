package corejava.stringmanipuation;

import java.util.Date;

public class StringManipulation {

	public static void main(String[] args) {
		String Str1 = "Hello";
		String str3 = "HeLlo";
		String str2 = "World";
		Date dt=new Date();
		System.out.println(dt.toString());
	
		String msg = "Hello guys how are you";
		System.out.println(Str1.toLowerCase());
		System.out.println(Str1.toUpperCase());
		System.out.println(Str1.replace('l','o'));
		System.out.println(Str1.equals(str2));
		System.out.println(Str1.equalsIgnoreCase(str3));
		System.out.println(Str1.charAt(2));
		System.out.println(Str1.compareTo(str3));
		System.out.println(Str1.indexOf(2));
		System.out.println(str2.length());
		System.out.println(str2.substring(1));
		System.out.println(str3.endsWith(str2));
		System.out.println(str2.trim());
		System.out.println(Str1.concat(str3));
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareToIgnoreCase(Str1));
		System.out.println(Str1.contentEquals(str2));
		System.out.println(str2.contains(Str1));
		System.out.println(Str1.isEmpty());
		System.out.println(str3.join(str2));
	}
}