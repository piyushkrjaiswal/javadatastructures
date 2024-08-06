package dev.pkj.javadatastructures.checkpalindromenode;

import java.util.Stack;

public class CheckPalindrome {
    public Boolean isPalindrome(Node node) {
        Node head = node;
        Node tail = node;
        Stack<Integer> st = new Stack<>();
        while(tail != null) {
            st.push(tail.val);
            tail = tail.next;
        }

        Node current = node;
        while((current.next != null) && !st.empty()) {
            int top = st.peek();
            if(top != current.val) {
                return false;
            }
            st.pop();
            current = current.next;
        }

        return true;
    }


    }

