package dev.pkj.javadatastructures.sample;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class files {

    public static void main(String[] args) throws IOException {
//        File file = new File("./Users/testaccount/Desktop/filesave");
//        String filePath = readFile("/Users/testaccount/IdeaProjects/javadatastructures/src/main/java/dev/pkj/javadatastructures/sample/local");
//        String fileData = readFile(String.valueOf(filePath));
//        System.out.println(fileData);
          String s = "This is Java Interview. \n" +
                  "We interview for senior roles.\n" +
                  "We are EXL Data Management Team\n" +
                  "This is the first round discussion";
          String x = "[\\\n]";
          List<String> ls = List.of(s.split(x));
        Iterator<String> itr = ls.iterator();
        int lines = 0;
        HashMap<String, Integer> hm = new HashMap<>();

        while(itr.hasNext()) {
            lines += 1;

            String[] ssplit = itr.next().split("[\\s]");
            System.out.println(ssplit.length);

            for(int i = 0; i < ssplit.length; i++) {
                if(hm.containsKey(ssplit[i])) {
                    int val = hm.get(ssplit[i]);
                    hm.put(ssplit[i], val+1);
                } else {
                    hm.put(ssplit[i], 1);
                }

            }
        }

        System.out.println(lines/2);

        for(Map.Entry<String, Integer> set: hm.entrySet()) {
            if(set.getValue() >= lines/2) {
                System.out.println(set.getKey() + " " + set.getValue());
           }
        }


    }
//    public static String readFile(String filePath) throws IOException {
//        ClassPathResource resource = new ClassPathResource(filePath);
//        byte[] fileData = Files.readAllBytes(Paths.get(resource.getURI()));
//        return new String(fileData);
//    }

}
