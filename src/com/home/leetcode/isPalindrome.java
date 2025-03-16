package com.home.leetcode;

//Palindrome Number
//
//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 obj = new Solution1();
		System.out.println(obj.isPalindrome(121));
		System.out.println(obj.isPalindrome(-121));
		System.out.println(obj.isPalindrome(10));
	}

}
class Solution1 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x >= 0 && x <= 9){
            return true;
        }
        else{
            byte rem = 0;
            int rev = 0;
            int num = x;
            while(x > 0){
                rem = (byte) (x % 10);
                rev = rev*10 + rem;
                x = x / 10;
            }
            if(rev == num){
                return true;
            }
            return false;
        }
    }
}