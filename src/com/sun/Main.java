package com.sun;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        AddTwoNumber2 addTwoNumber2 = new AddTwoNumber2();
        AddTwoNumber2.ListNode listNode1 = new AddTwoNumber2.ListNode(9);
        AddTwoNumber2.ListNode listNode2 = new AddTwoNumber2.ListNode(1);
        AddTwoNumber2.ListNode nextNode = listNode2;
        for(int i = 0; i < 9; i ++){
            nextNode.next = new AddTwoNumber2.ListNode(9);
            nextNode = nextNode.next;
        }
        AddTwoNumber2.ListNode res = addTwoNumber2.addTwoNumbers(listNode1, listNode2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
