/**
 * 
 */
package epam_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vishwanath Reddy
 *
 */
public class AverageOfListOfIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		
		//lets assume the list containing 10 elements
		
		//int n=sc.nextInt();
		
		int n=10;
		
		for(int i=0;i<n;i++) {
			list.add(i);
			//list.add(sc.nextInt());
		}
		
		Operations operation=new Operations();
		
		System.out.println(operation.CalculateAverage(list));
		
		sc.close();
	}

}
