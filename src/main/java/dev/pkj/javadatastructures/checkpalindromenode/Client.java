package dev.pkj.javadatastructures.checkpalindromenode;

public class Client {
    public static void main(String[] args) {
        Node head = null;
        Node n = new Node(10);
        n.next = new Node(20);
        n.next.next = new Node(30);
        n.next.next.next = new Node(30);
        n.next.next.next.next = new Node(20);
        n.next.next.next.next.next = new Node(10);

        head = n;

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        CheckPalindrome cp = new CheckPalindrome();
        System.out.println(cp.isPalindrome(n));



    }


}
