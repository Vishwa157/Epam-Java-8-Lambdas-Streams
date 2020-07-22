/**
 * 
 */
package epam_Tasks;

import java.util.List;

/**
 * @author Vishwanath Reddy
 *
 */
public class Operations {
	
	public double CalculateAverage(List<Integer> myList) {
		
		double average=0.0;
		
		for(int i=0;i<myList.size();i++) {
			average+=myList.get(i);
		}
		average /= myList.size();
		return average;
	}
	
}
