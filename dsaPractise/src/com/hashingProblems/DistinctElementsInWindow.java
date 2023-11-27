package com.hashingProblems;

import java.util.HashMap;

public class DistinctElementsInWindow {
	 public static int[] dNums(int[] A, int B) {
	        int n =A.length;
	        int ans[]= new int[n-B+1];
	        if(B > n){
	            return ans;
	        }
	        HashMap<Integer, Integer> map =new HashMap<>();
	        for(int i=0; i<B; i++){
	            if(map.containsKey(A[i])){
	                map.put(A[i], map.get(A[i])+1 );
	            }
	            else{
	                map.put(A[i],1);
	            }
	        }
	        ans[0]=map.size();
	        int s =1;
	        int e =B;

	        int count =map.size();
	        while(e < n){
	            // remove
	            if(map.containsKey(A[s-1])){
	                map.put(A[s-1], map.get(A[s-1])-1);
	            }
	            if(map.get(A[s-1]) == 0){
	                map.remove(A[s-1]);
	            }
	            // insert
	            if(map.containsKey(A[e])){
	                map.put(A[e], map.get(A[e])+1);
	            }
	            else{
	                map.put(A[e],1);
	            }
	            // insert in Array
	            ans[s] = map.size();
	            s++;
	            e++;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip[] = {1, 2, 1, 3, 4, 3 };
		int k = 3;
		System.out.println(dNums(ip, k));

	}

}
