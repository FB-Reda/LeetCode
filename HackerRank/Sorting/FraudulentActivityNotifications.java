package Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

	// Complete the activityNotifications function below.
	static int activityNotifications(int[] expenditure, int d) {
		
		double median;
		int alertCount = 0;
		
		//Create sorted sub-array of d
		int[] medianArray = Arrays.copyOfRange(expenditure, 0, d);
		Arrays.sort(medianArray);
		
		//find median
		if (medianArray.length % 2 == 0)
			median = (medianArray[(medianArray.length/2)-1] + medianArray[medianArray.length/2]/2.0);
		else
			median = medianArray[(medianArray.length-1)/2];
		
		//If expenditure is double median, tally alerts
		for (int i = d; i < expenditure.length-1; i++){
			if (expenditure[i] >= median*2)
				alertCount++;
		}
		System.out.println("D:"+ d);
		System.out.println("AlertCount: " + alertCount);
		System.out.println("MedianArray: " + Arrays.toString(medianArray));
		System.out.println("Median: " + median + "\n");
		return alertCount;
		
	}
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(name)));
	}
	

}