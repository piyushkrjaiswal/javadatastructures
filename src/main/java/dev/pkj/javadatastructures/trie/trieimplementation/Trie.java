package dev.pkj.javadatastructures.trie.trieimplementation;

import java.util.HashMap;

public class Trie {

    public class Node {
        boolean isEnd;
        HashMap<Character, Node> hm;

        public Node() {
            isEnd = false;
            hm = new HashMap<Character, Node> ();

        }

    }

    Node start;

    public Trie() {
        start = new Node();
    }


    public void insert(String word) {
        Node head = start;

        int l = word.length();
        for(int i = 0; i < l; i++) {
            char ch = word.charAt(i);
            if(head.hm.containsKey(ch)) {
                head = head.hm.get(ch);
            } else {
                head.hm.put(ch, new Node());
            }

        }
        head.isEnd = true;

        return;

    }

    public boolean search(String word) {
        Node head = start;
        int l = word.length();
        for(int i = 0; i <l; i++) {
            char ch = word.charAt(i);
            if(head.hm.containsKey(ch)) {
                head = head.hm.get(ch);
            } else {
                return false;
            }
        }

        return head.isEnd;


    }

    public boolean startsWith(String prefix) {
        Node head = start;
        int l = prefix.length();
        for(int i = 0; i <l; i++) {
            char ch = prefix.charAt(i);
            if(head.hm.containsKey(ch)) {
                head = head.hm.get(ch);
            } else {
                return false;
            }
        }

        return true;

    }

}
