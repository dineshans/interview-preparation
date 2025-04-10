package com.linkedlist;


// 1) linked list, find the loop --> 2,3,4,5,6

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LinkedListProblem {

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next = head.next;
        boolean result = checkIfCycle(head);
        System.out.println("Is linked list have cycle : " + result);
    }

    public static boolean checkIfCycle(Node head) {
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null) {
            map.put(temp, map.getOrDefault(temp, 1) + 1);
            temp = temp.next;
        }
        Optional<Integer> optional = map.values().stream().filter(x -> x>1).findFirst();
        if (optional.isPresent()) {
            return true;
        }
        return false;
    }

    public static boolean checkIfCycleInLinkedList(Node head) {

        Node slow = head;
        Node fast = head;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}


class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
