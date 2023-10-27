package com.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class CountGoodSubString {
	 public static int countGoodSubstrings(String s) {		 
         Set<Character> set = new HashSet();
        int window = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            window++;
            if(window == 3) {
                if(set.size() == 3) {
                    count++;
                    window = 0;
                } else {
                    window = 0;
                }
                set.clear();
                i -= 2;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" ***   input   ***   ");	
		int ipArray[] = {3,6,7,1,9,1};
		String ipString = "xyzzaqzr";
		
		System.out.println(" --> "+ ipString);
/*
	
		System.out.print("[");
		for(int item : ipArray) {			
			System.out.print(item +" ");
		}
		System.out.println("]");
*/
		System.out.println(countGoodSubstrings(ipString));

	}

}
