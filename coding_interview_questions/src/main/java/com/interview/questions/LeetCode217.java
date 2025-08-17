package com.interview.questions;

import java.util.HashSet;

public class LeetCode217 {
    public static void main(String[] args) {
        // Contains Duplicate
        // Time complexity ---> O(n)
        int array[] = {1,1,1,3,3,4,3,2,4,2};
        boolean response = containsDuplicates(array);
        System.out.println(response);
    }

    private static boolean containsDuplicates(int array[]){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int value: array){
            if(hashSet.contains(value)){
                return true;
            }
            hashSet.add(value);
        }
        return false;
    }
}