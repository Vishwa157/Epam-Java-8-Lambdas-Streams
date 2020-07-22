/**
 * 
 */
package epam_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Vishwanath Reddy
 *
 */
public class PalindromeStrings {

	/**
	 * @param args
	 */
	
	public static List<String> filterPalindromeStrings(List<String> list, Predicate<String> predicate) {
	
		List<String> palindromeStrings=new ArrayList<String>();
		
		for(String item: list) {
			if(predicate.test(item)) {
				palindromeStrings.add(item);
			}
		}
		
		return palindromeStrings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"a", "aba", "redivider", "civic", "civia", "radax", "radar", "mum", "dadd", "dad"};
		
		List<String> list=Arrays.asList(str);
		
		List<String> palindromes=filterPalindromeStrings(list, (String s) -> isPalindrome(s));
		System.out.println("String array containing only palindrome Strings "+palindromes);
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i=0, j=str.length() - 1; 
		
        while (i<j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            i++; 
            j--; 
        }
		return true;
	}

}
