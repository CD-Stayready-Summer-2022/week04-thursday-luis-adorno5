package com.codedifferently.problem03;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Integer[] stringToNumbers(String[] input){
        Integer[] result = new Integer[input.length];
        Map<String, Integer> conversion = new HashMap<>();
        populateMap(conversion);
        int i = 0;
        for(String s : input){
            result[i] = conversion.get(s);
            i++;
        }
        return result;
    }

    private void populateMap(Map<String, Integer> conversion){
        conversion.put("zero", 0);
        conversion.put("one", 1);
        conversion.put("two", 2);
        conversion.put("three", 3);
        conversion.put("four", 4);
        conversion.put("five", 5);
        conversion.put("six", 6);
        conversion.put("seven", 7);
        conversion.put("eight", 8);
        conversion.put("nine", 9);
        conversion.put("ten", 10);
        conversion.put("eleven", 11);
        conversion.put("twelve", 12);
        conversion.put("thirteen", 13);
        conversion.put("fourteen", 14);
        conversion.put("fifteen", 15);
        conversion.put("sixteen", 16);
        conversion.put("seventeen", 17);
        conversion.put("eighteen", 18);
        conversion.put("nineteen", 19);
        conversion.put("twenty", 20);
    }
}
