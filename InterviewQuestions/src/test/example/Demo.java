package test.example;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		System.out.println("hii");
		 String first = "abcbcd";
		    String second = "cdefef";
		    String common = commonCharacters(first, second);
		    System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

	}
	public static String commonCharacters(String a, String b) {
		Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(char c : a.toCharArray()) {
            set1.add(c);
        }
        for(char c : b.toCharArray()) {
            set2.add(c);
        }
        String c1="";

        // Stores the intersection of set1 and set2 inside set1
        set1.retainAll(set2);

        for(char c : set1) {
            System.out.print(" ---" + c);
        }

        System.out.println("\nTotal number of common characters: "
            + set1.size());
	    return c1;
	}

}
