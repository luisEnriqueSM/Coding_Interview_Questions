package com.interview.questions;

import java.util.ArrayList;

public class LeetCode242 {

    public static void main(String args[]){
        // 242 Valid Anagram
        String s = "cart";
        String t = "tarx";
        boolean result = validAnagram(s, t);
        System.out.println(result);
    }

    private static boolean validAnagram(String s, String t){
        
        // Check the length of both strings
        if(s.length() != t.length()){
            return false;
        }

        // Initialize an array to count character frecuency
        int[] charCounts = new int[26];

        // Increment for each character in 's' and decrement for each in 't'
        for(int i = 0; i<s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for(int count: charCounts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
