package com.codedifferently.problem01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        Set<Integer> sortedNums = new TreeSet<>(List.of(allNumbers));
        int longestStreak = 0;
        String currentLongest = "";
        for(int num : sortedNums){
            if(!sortedNums.contains(num-1)){
                int currentNum = num;
                int streak = 1;
                String currentArray = "{"+currentNum;
                while(sortedNums.contains(currentNum+1)){
                    currentNum+=1;
                    currentArray += " " + currentNum;
                    streak +=1;
                }
                if(longestStreak < streak){
                    longestStreak = streak;
                    currentLongest = currentArray;
                }

            }
        }

        return "Longest Set: " + currentLongest+"}";

    }
}
