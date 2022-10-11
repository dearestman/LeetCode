package com.company;

import java.util.HashMap;

public class Main {
    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[] {hashMap.get(nums[i]), i};
            }
            hashMap.put(target-nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {

        int[] test = {2, 7, 11, 15};
        System.out.println(twoSum(test,9)[0]);
        System.out.println(twoSum(test,9)[1]);
    }
}
