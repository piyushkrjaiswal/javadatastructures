package dev.pkj.javadatastructures.result;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class Client {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        //"Babu", "Indu", "Ravi", "Babu", "Lakshmi", "Arun"
        s.add("Babu");
        s.add("Indu");
        s.add("Ravi");
        s.add("Babu");
        s.add("Lakshmi");
        s.add("Arun");

        HashSet<String> set = new HashSet<>();
//        List<String> ls = s.stream().filter(x -> {
//            if (set.contains(x)) {
//                return true;
//            }
//            set.add(x);
//            return false;
//        }).collect(Collectors.toList()).forEach(System.out::println);



    }
}
