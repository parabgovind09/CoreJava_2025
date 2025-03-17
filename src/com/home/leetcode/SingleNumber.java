package com.home.leetcode;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 obj = new Solution2();
		System.out.println(obj.singleNumber(new int[] {2,2,1}));
		System.out.println(obj.singleNumber(new int[] {4,1,2,1,2}));
		System.out.println(obj.singleNumber(new int[] {1}));
	}

}
// O(n)
class Solution2 {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int a : nums){
            x = x^a;
        }
        return x;
    }
}