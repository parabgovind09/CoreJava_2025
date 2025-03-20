package com.home.leetcode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 obj = new Solution5();
		System.out.println(obj.removeDuplicates(new int[] {0,0,1,1,2,3,4,4}));
		System.out.println(obj.removeDuplicates(new int[] {2,20,30,30,30,30,30,30,40,40,40,40,40}));
	}

}
//O(n)
//class Solution5 {
//    public int removeDuplicates(int[] nums) {
//    	if(nums.length==0) {
//    		return 0;
//    	}
//        int k = 1;
//        for(int i = 0, j = 1; i < nums.length && j < nums.length;){
//            if(nums[i] == nums[j]){
//                ++j;
//            }
//            else if(nums[i] != nums[j]){
//                nums[i+1] = nums[j];
//                ++i;
//                ++k;
//                ++j;
//            }
//        }
//        return k;
//    }
//}
//O(n)
class Solution5 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                ++k;
            }
        }
        return k;
    }
}