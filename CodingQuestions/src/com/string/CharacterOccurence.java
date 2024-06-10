package com.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {
    public static void main(String[] args) {
        String str = "malayalam";
        
        Map<Character, Long> occurence = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        occurence.forEach((Character,Long) -> System.out.println(Character + " : " + Long));
        
       // second approach
        
        
    }

}