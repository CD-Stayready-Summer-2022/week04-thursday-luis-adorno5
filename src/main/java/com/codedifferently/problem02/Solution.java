package com.codedifferently.problem02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        char[] sortedLetters = input.toCharArray();
        Arrays.sort(sortedLetters);
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char current : sortedLetters) {
            if (!letterCount.containsKey(current)) {
                letterCount.put(current, 1);
            } else {
                letterCount.put(current, letterCount.get(current) + 1);
            }
        }
        return formatMapToString(letterCount);
    }

    private String formatMapToString(Map<Character, Integer> map){
        StringBuilder result = new StringBuilder();
        for(char key : map.keySet()){
            result.append(key).append(":").append(map.get(key)).append(" ");
        }

        return result.toString().substring(0, result.length() - 1);
    }
}
