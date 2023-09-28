package com.prefixsum;

public class LeftRightDiff {

	public static int[] leftRightDifference(int[] nums) {
		int n = nums.length;
        int leftSumArray[] = new int [n];
        int rightSumArray[] = new int [n];
        int resArray[] = new int [n];
        int sum = 0;
        
        int left = 0;
        int right = n-1;
        while(left<n && right>=0){        
            if(left== 0 && right==n-1){
                leftSumArray[left]=0;
                rightSumArray[right]=0;
            }else{
                leftSumArray[left]=leftSumArray[left-1]+nums[left-1];
                rightSumArray[right]=rightSumArray[right+1]+nums[right+1];
            }            
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
            // System.out.print(leftSumArray[i]+"  ");
            resArray[i]= (leftSumArray[i]>rightSumArray[i])?(leftSumArray[i]-rightSumArray[i]):(rightSumArray[i]-leftSumArray[i]);
        }        
        
        return resArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ipArray[] = {10,4,8,3};
		int result[] = new int [ipArray.length];
		
		// calling the test function
		result = leftRightDifference(ipArray);
		
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
