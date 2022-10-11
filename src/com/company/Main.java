package com.company;

import java.util.HashMap;

public class Main {
    static public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        boolean result = false;
        char[] nums = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (nums[i]==nums[nums.length-1-i]){
                result=true;
            }
            else return false;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }
}
