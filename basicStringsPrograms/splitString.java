
// Java Program to split a string into all possible 
// substrings excluding the string with 0 characters i.e. "" 

import java.util.ArrayList; 

public class splitString { 
	public static ArrayList<String> splitSubstrings(String s) 
	{ 
		int i, j;
		int len = s.length();
		ArrayList<String> sb = new ArrayList<String>();

		for (i = 0; i < len; i++) { 
			for (j = i + 1; j <= len; j++) { 
				sb.add(s.substring(i, j)); 
			} 

		} 
		return sb; 
	} 

	public static void main(String[] args) 
	{
		String str = new String("The Cat"); 

		ArrayList<String> sub = splitString.splitSubstrings(str); 

		System.out.println("\nSubstring list printed as an ArrayList : "); 
		System.out.println(sub); 

		System.out.println("\n\nAll substrings printed 1 per line : "); 
		int count = 1;
		for (String i : sub) {
			System.out.println("(" + count + ") \"" + i + "\""); 
			count++; 
		} 
	} 
}


