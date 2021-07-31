package homework1;

import java.util.*;

public class DisplayNameInShort {

	public static void main(String[] args) {
		String name = "Ram Kishore Singh";
		
		System.out.println("The Full Name is: " + name);
		System.out.print("The Short Name is: ");
		
		int l1 = name.length();
		name = name.trim();
		String s1 = "";
		for (int i = 0; i < l1; i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				s1 = s1 + ch;
			} else {
				System.out.print(Character.toUpperCase(s1.charAt(0)) + ". ");
				s1 = "";
			}
		}
		String s2 = "";
		for (int j = 0; j < s1.length(); j++) {
			if (j == 0)
				s2 = s2 + Character.toUpperCase(s1.charAt(0));
			else
				s2 = s2 + Character.toLowerCase(s1.charAt(j));
		}
		System.out.println(s2);
	}
}
