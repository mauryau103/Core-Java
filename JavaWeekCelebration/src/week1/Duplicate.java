package week1;

import java.util.HashSet;

class Solution {
	
	public static boolean containDuplicate(int[] nums) {
		
		HashSet<Integer> h = new HashSet();
        for(int i : nums) h.add(i);
        return h.size() != nums.length;
		
		
		
	}
	
	

    public static boolean containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

        }
        if(count>0) {
        	return true; 
        }
        else {
			return false;
		}
		 
      
    
    }
     
}
public class Duplicate {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		System.out.println(Solution.containsDuplicate(arr));
		
	}

}
