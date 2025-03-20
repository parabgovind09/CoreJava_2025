package com.home.leetcode;

public class IndexOfFirstOccurrenceInString {

	class Solution {
	    public int strStr(String haystack, String needle) {
	        return haystack.indexOf(needle);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndexOfFirstOccurrenceInString obj = new IndexOfFirstOccurrenceInString();
		Solution obj1 = obj.new Solution();
		System.out.println(obj1.strStr("hello govind how are you", "ow"));
	}

}
//class Solution {
//    public int strStr(String haystack, String needle) {
//        if(needle.length() > haystack.length()){
//            return -1;
//        }
//        for(int i = 0 , j = needle.length() ; j <= haystack.length() ; i++,j++){
//            if(haystack.substring(i,j).equals(needle)){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
