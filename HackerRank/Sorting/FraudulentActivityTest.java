package Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FraudulentActivityTest {

	@Test
	void test0() {
		int[] input = {2, 3, 4, 2, 3, 6, 8, 4, 5};
		int inD = 5;
		
		int expected = 2;
		
		System.out.println("Test 0");
		System.out.println("Expected: " + expected);
		int result = FraudulentActivityNotifications.activityNotifications(input, inD);
		
		
		assertEquals(expected, result);
	}
	
	@Test
	void test1() {
		int[] input = {2, 3, 4, 2, 3, 6, 8, 4, 5};
		int inD = 5;
		
		int expected = 2;
		
		System.out.println("Test 0");
		System.out.println("Expected: " + expected);
		int result = FraudulentActivityNotifications.activityNotifications(input, inD);
		
		
		assertEquals(expected, result);
	}
	
	
	@Test
	void test6() {
		int[] input = {1, 2, 3, 4, 4};
		int inD = 4;
		
		int expected = 0;
		
		System.out.println("Test 6");
		System.out.println("Expected: " + expected);
		int result = FraudulentActivityNotifications.activityNotifications(input, inD);
		
		
		assertEquals(expected, result);
	}
	
	@Test
	void test7() {
		int[] input = {10, 20, 30, 40, 50};
		int inD = 3;
		
		int expected = 1;
		
		System.out.println("Test 7");
		System.out.println("Expected: " + expected);
		int result = FraudulentActivityNotifications.activityNotifications(input, inD);
		
		
		assertEquals(expected, result);
	}

}
