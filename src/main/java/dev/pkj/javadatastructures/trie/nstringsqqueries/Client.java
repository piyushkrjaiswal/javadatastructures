package dev.pkj.javadatastructures.trie.nstringsqqueries;

public class Client {

    public static void main(String[] args) {
        Node node = new Node();
        int n = 5;
        for(int i = 0; i < n; i++) {
            insert(node, "damp");
            insert(node, "dark");
            insert(node, "data");
            insert(node, "drake");
            insert(node, "drawn");
            insert(node, "trie");
            insert(node, "trap");
        }

        int q = 2;
//        for(int i = 0; i < q; i++) {
        System.out.println(search(node, "drake"));
        System.out.println(search(node, "draw"));
        System.out.println(search(node, "trap"));
//        }
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
        t.isEnd = true;

    }

    public static boolean search(Node root, String word) {
        Node t = root;
        int l = word.length();
        for(int i = 0; i < l; i++) {
            char ch = word.charAt(i);
            if(t.hm.containsKey(ch)) {
                t = t.hm.get(ch);
            } else {
                return false;
            }
        }

        return t.isEnd;
    }




}
