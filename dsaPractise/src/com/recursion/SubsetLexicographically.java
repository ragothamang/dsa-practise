package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetLexicographically {
	static ArrayList<ArrayList<Integer>> ans;
	 public static ArrayList<ArrayList<Integer>> subsets1(List<Integer> input) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        int index = 0;
	        
	        Collections.sort(input);
	        result.add(new ArrayList<>());
	        generateSubsets(input, index, result, new ArrayList<>());
	        return result;
	    }

	    private static void generateSubsets(List<Integer> input,
	                                        int index,
	                                        ArrayList<ArrayList<Integer>> result,
	                                        ArrayList<Integer> subsets) {
	    	System.out.println("start of call>>  "+" index "+ index+ " result "+ result + " subset "+ subsets);
	        if (index < 0 || index >= input.size()) {
	            return;
	        }
	        {
	            //case 1 - choosing the current value
	            //Do Step
	            subsets.add(input.get(index));
	            result.add(new ArrayList<>(subsets));
	            //Recur Step
	            System.out.println("index  "+  index +" subsets "+subsets+"  final result "+ result);
	            generateSubsets(input, index + 1, result, subsets);
	            //Undo Step
	            subsets.remove(subsets.size() - 1);
	        }
	        System.out.println("**************");
	        {
	            //case 2 - Not Choosing current value
	            generateSubsets(input, index + 1, result, subsets);
	        }
	    }

	    public static ArrayList<ArrayList<Integer>> subsets(List<Integer> list) {
	         Collections.sort(list);
	        ArrayList<Integer> cur =  new ArrayList<>();
	        ans = new ArrayList<>();
	        getss(list,0,cur);
	        return ans;
	    }
	    public static void getss(List<Integer> A, int i,ArrayList<Integer> cur){
	    	System.out.println("~~~~~ call start "+ " index  "+ i + " cur "+ cur);
	        if(i==0) ans.add(cur);

	        if(i==A.size()) {
	        	System.out.println(" next line "+"  i  "+i);
	        	return;
	        }
	        ArrayList<Integer> temp = new ArrayList<>(cur);

	        temp.add(A.get(i));
	        ans.add(temp);
	        System.out.println("Index "+ i +" temp list "+temp + " final "+ ans);
	        getss(A,i+1,temp);
	        System.out.println("**** Index "+ i +" temp "+ temp + " ## curr" + cur + " final "+ ans);
	        getss(A,i+1,cur);
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ArrayList<ArrayList<Integer>> subsets = subsets((List<Integer>) Arrays.asList(1,2));
		ArrayList<ArrayList<Integer>> subsets = subsets((List<Integer>) Arrays.asList(1,2,3));
//		ArrayList<ArrayList<Integer>> subsets = subsets1((List<Integer>) Arrays.asList(1,2,3));
        System.out.println(subsets);
	}

}
