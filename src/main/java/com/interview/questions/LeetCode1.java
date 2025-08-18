package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public static void main(String args[]){
        // 1. Two Sum
        int[] nums = new int[] {2,15,11,7};
        int[] result = twoSum(nums, 9);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> storedMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int need = target - nums[i];
            if(!storedMap.containsKey(need)){
                storedMap.put(nums[i], i);
            } else {
                return new int[] {i, storedMap.get(need)};
             }
        }
        return nums;
    }

}
