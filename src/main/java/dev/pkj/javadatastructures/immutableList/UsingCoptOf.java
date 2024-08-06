package dev.pkj.javadatastructures.immutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UsingCoptOf {
    public static void main(String[] args) {
       final List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
//       final List<String> unmodifiableList = List.of(list.toArray(new String[]{}));
//       unmodifiableList.add("four");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}
