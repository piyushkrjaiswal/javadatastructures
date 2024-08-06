package dev.pkj.javadatastructures.linkedlists;

public class PrintLLinSpaceSeparatedManner {
    public void printElement(ListNode A) {
        ListNode head = A;
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public ListNode addElement(ListNode A, int B, int C) {
        ListNode head = A;
        ListNode tail = head;
        ListNode newNode = new ListNode(B);
        ListNode temp = null;
        int count = 0;
        if(C==0) {
            temp = tail.next;
            newNode.next = temp;
            head = newNode;
        }

        while(tail.next != null && count != C) {
            tail = tail.next;
            count++;
        }

        if(tail.next != null) {
            temp = tail.next;
            tail.next = newNode;
            newNode.next = temp;
        } else {
            newNode.next = null;
            tail.next = newNode;
        }

        return head;

    }

    public ListNode deleteNode(ListNode A, int B) {
        ListNode head = A;
        ListNode tail = head;
        ListNode prev = head;
        int count = 0;
        if(count == B) {
            tail = tail.next;
            head = tail;
            return head;
        }

        while(tail.next != null) {
            prev = tail;
            tail = tail.next;
            count++;
            if(count == B) {
                prev = tail.next;
                tail.next = null;
            }
        }

        return head;
    }

    public void solveEeverse(ListNode A) {
        ListNode head = A;
        reverseNode(A);
        System.out.println();
    }

    public void reverseNode(ListNode A) {
        ListNode head = A;
        if(head.next == null) {
            System.out.print(head.val);
            return;
        }

        reverseNode(head.next);
        System.out.println(head.val + " ");

        return;

    }
}
