package LinkedList;

import java.util.Stack;

/*
 * LeetCode 445 - Add Two Numbers II
 *
 * Problem:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in forward order, and each node contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * Approach:
 * 1. Push all nodes of both linked lists into two stacks.
 * 2. Pop values from the stacks and add them with carry.
 * 3. Create a new node for each digit.
 * 4. Insert the new node at the beginning of the result list. 
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
 */

public class LeetCode445_AddTwoNumbersII {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push all digits of first number into stack
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        // Push all digits of second number into stack
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        // Process until both stacks are empty and no carry remains
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }

            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }

            carry = sum / 10;

            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    // Run Code
    public static void main(String[] args) {

        // First Number: 7243
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        // Second Number: 564
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        LeetCode445_AddTwoNumbersII solution = new LeetCode445_AddTwoNumbersII();

        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println("First Number:");
        printList(l1);

        System.out.println("Second Number:");
        printList(l2);

        System.out.println("Result:");
        printList(result);
    }
}
