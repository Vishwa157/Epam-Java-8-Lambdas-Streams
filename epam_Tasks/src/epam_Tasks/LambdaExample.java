/**
 * 
 */
package epam_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vishwanath Reddy
 *
 */
public class LambdaExample {

	static List<String> list;
	/**
	 * @param args
	 */
	
	static List<String> Validate(){
		
		List<String> result=new ArrayList<String>();
		
		FunctionalInterface functionalInterfacObject;
		
		functionalInterfacObject = (list) ->
		{
			for(String item: list) {
				if(item.length()==3 && item.charAt(0)=='a') {
					result.add(item);
				}
			}
		};
		
		functionalInterfacObject.ValidateStrings(list);
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		String[] str= {"aaa", "abc", "bab", "aba", "abb", "abcc", "abbcaa", "aax", "axcy", "agt"};
		
		list=Arrays.asList(str);
		
		List<String> result=Validate();
		
		System.out.println(result);
		
		sc.close();
	}

}
