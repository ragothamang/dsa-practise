package dsaExercises.com.array;

import java.util.Arrays;

public class SubarrayAll {
	
	 public static  int[][] solve(int[] A) {
	      int N = A.length;
	        int[][] subarrays = new int[N * (N + 1) / 2][];
	        int subarrayIndex = 0;

	        for (int start = 0; start < N; start++) {
	            for (int end = start + 1; end <= N; end++) {
	                int subarrayLength = end - start;
	                int[] subarray = new int[subarrayLength];
	                
	                for (int i = 0; i < subarrayLength; i++) {
	                    subarray[i] = A[start + i];
	                }
	                
	                subarrays[subarrayIndex] = subarray;
	                subarrayIndex++;
	            }
	        }

	        return subarrays;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test ");
		int[] A= {1,2,3};
		int[][] result = solve(A);
		for(int[] item : result) {
			for(int i : item) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
