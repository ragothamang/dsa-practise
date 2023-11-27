package com.mergeSort;

import java.util.Arrays;

public class MinStepsToUniqueArray {
	 public static int solve(int[] A) {

		// Get the length of the array
		        int n = A.length;
		        
		        // Sort the array in ascending order
		        Arrays.sort(A);
		        
		        // Initialize a variable to count the number of operations needed
		        int count = 0;
		        
		        // Iterate through the array
		        for (int i = 0; i < (A.length - 1); i++) {
		            // Check if the current element is less than the next element
		            if (A[i] < A[i + 1]) {
		                // If yes, continue to the next iteration
		                continue;
		            } else {
		                // If not, calculate the number of operations needed
		                count += (A[i] + 1 - A[i + 1]);
		                
		                // Update the next element to make the array strictly increasing
		                A[i + 1] = A[i] + 1;
		            }
		        }
		        
		        // Return the total count of operations
		        return count;   
		        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip[] = {2,3,9,-4,1,5,6,2,5 };
		System.out.print("[");
		for(int item : ip) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
		
		System.out.println(solve(ip));
		
		
		System.out.print("[");
		for(int item : ip) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
		

	}

}
