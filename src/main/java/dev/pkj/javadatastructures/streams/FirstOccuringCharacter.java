package dev.pkj.javadatastructures.streams;

import java.util.stream.Collectors;

public class FirstOccuringCharacter {
    public static void main(String[] args) {
        String s = "Piyush Jaiswal";
        String f = s.chars().mapToObj(q -> (char) q)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .findFirst()
                .orElse(null).toString();
        System.out.println(f);
    }
}
