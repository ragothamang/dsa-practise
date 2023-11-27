package com.hashingProblems;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySumEqualsK {
	public static int solve(int[] A, int B) {
		int N=A.length;
		long[] ps=new long[N];
		long sum=0;
		int count=0;
		//calculate the prefix sum of the array
		for(int i=0;i<N;i++){
			sum=sum+A[i];
			ps[i]=sum;
			if(ps[i]==B){
				count++;//if any element is equals to B means from the 0th position there is a subarray with sum B
			}
		}
		System.out.println("c -> "+ count);
		System.out.println("K -> "+B);
		System.out.println("A ->  "+Arrays.toString(A));
		System.out.println("ps->  "+Arrays.toString(ps));
		//Create a hashmap for the prefix sum array
		HashMap<Long,Integer> hm=new HashMap<>();
		// enter the prefix sum array elements count in the hashmap
		for(int i=0;i<N;i++){
			if(hm.containsKey(ps[i])){
				System.out.println("hm contains "+ ps[i]);
				hm.put(ps[i],hm.get(ps[i])+1);
			}
			else{
				System.out.println("hm didn't contains "+ ps[i]);
				hm.put(ps[i],1);
			}
			System.out.println("ps[i]-B  "+ (ps[i]-B));
			if(hm.containsKey(ps[i]-B)){
				if(B==0){//if B=0 the two elements will be the same in that case we need to -1 count
					count=count+hm.get(ps[i]-B)-1;
				}
				else{
					count=count+hm.get(ps[i]-B);// count of the subarray will be the count of the element
				}
			}
			System.out.println("for loop count -> "+count);
		}
		System.out.println(hm);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ip[] = {0,6,2,3,4,8,0,1,3,4,8,4,7};
		int ip[] = {2,3,9,-4,1,5,6,2,5 };
		int k = 11;
		System.out.println(solve(ip, k));

	}

}
