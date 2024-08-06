package dev.pkj.javadatastructures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonRepeatativeWordsFromString {
    public static void main(String[] args) {
        String txt = "This is a test string with some repetitive words and some non-repetitive words.";
        List<String> words = Arrays.stream(txt.split("\\s+"))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(words);

    }
}
