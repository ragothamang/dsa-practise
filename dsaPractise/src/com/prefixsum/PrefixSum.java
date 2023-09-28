package com.prefixsum;

public class PrefixSum {
	public static int[] runningSum(int[] nums) {
		int n = nums.length;
        int resArray[] = new int[n];
        int sum = 0;
        resArray[0]=nums[0];
        for(int i=1;i<n;i++){
           resArray[i] = resArray[i-1]  + nums[i] ;           
        }
        return resArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ipArray[] = {3,6,7,1,9};
		int result[] = new int [ipArray.length];
		result = runningSum(ipArray);
		
		System.out.print(" ***   input   ***   ");
		System.out.print("[");
		for(int item : ipArray) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
		
		
		System.out.print(" ***   output   ***   ");
		System.out.print("[");
		for(int item : result) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
	}

}
