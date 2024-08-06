package dev.pkj.javadatastructures.trie.nstringsqqueriesprofixword;

import java.util.HashMap;

public class Node {
    HashMap<Character, Node> hm;

    Node() {
        hm = new HashMap<Character, Node>();
    }
}
