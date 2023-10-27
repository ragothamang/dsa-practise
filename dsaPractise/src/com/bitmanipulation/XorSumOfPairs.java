package com.bitmanipulation;

public class XorSumOfPairs {
	 public static int solve(int[] A) {
	        long xorSum = 0;
	        int mod = 1000000007;

	        for(int i=0; i<32; i++){
	            long cntSet = 0;
	            long cntUnset = 0;
	            for(int j=0; j<A.length; j++){
	                //Find the number of set bits and the unset bits at the specific index.
	                if( (A[j] & (1<<i)) != 0 ){
	                    cntSet++;
	                }else{
	                    cntUnset++;
	                }
	            }
	            //The number of pairs of the digits which can make the final bit as 1 is the product of the
	            //the number of 0s and the 1s at the specific index. Because in XOR both bits have to be different
	            //for the bit to be set.
	            long pairs = cntSet * cntUnset;
	            xorSum += pairs * (1<<i);
	            System.out.println(" pairs  "+pairs +" pairs * (1<<i) "+pairs * (1<<i)+" (1<<i)  "+ (1<<i) );
	             System.out.println(xorSum);
	            xorSum = xorSum % mod;
	        }

	        return (int)xorSum % mod;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ip[] = {3,4,2};
		int ip[] = {8,9,10,11,17};
		System.out.println(solve(ip));
	}

}
