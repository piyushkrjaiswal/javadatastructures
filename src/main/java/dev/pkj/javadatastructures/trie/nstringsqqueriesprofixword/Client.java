package dev.pkj.javadatastructures.trie.nstringsqqueriesprofixword;

public class Client {
    public static void main(String[] args) {
        Node node = new Node();
        String [] s = {"draw", "drawn", "dance", "down", "trie", "tree"};
        for(int i = 0; i < s.length; i++) {
            insert(node, s[i]);
        }

        String [] sf = {"tr", "ta", "dra", "damp"};
        for(int i = 0; i < sf.length; i++) {
            System.out.println(search(node, sf[i]));
        }
    }

    public static void insert(Node root, String data) {
        Node t = root;
        int l = data.length();
        for(int i = 0; i < l; i++) {
            char ch = data.charAt(i);
            if(t.hm.containsKey(ch)) {
                t = t.hm.get(ch);
            } else {
                t.hm.put(ch, new Node());
                t = t.hm.get(ch);
            }
        }
        return;
    }

    public static boolean search(Node root, String str) {
        Node t = root;
        int l = str.length();
        for(int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if(t.hm.containsKey(ch)) {
                t = t.hm.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}
