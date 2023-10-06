package com.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ipArray[] = {3,6,7,1,9,1};

		System.out.print(" ***   input   ***   ");
		System.out.print("[");
		for(int item : ipArray) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
		System.out.println(containsNearbyDuplicate(ipArray, 2));
	}

}
