package com.sun;

import java.math.BigInteger;

/**
 * Created by sunbinqiang on 19/11/2016.
 */
public class AddTwoNumber2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = getNumFromList(l1);
        BigInteger num2 = getNumFromList(l2);

        BigInteger numRes = num1.add(num2);

        return getListFromNum(numRes);
    }

    public BigInteger getNumFromList(ListNode list){
        String bigNum = "";
        while(list != null){
            bigNum = list.val + bigNum;
            list = list.next;
        }
        return new BigInteger(bigNum);
    }

    public int pow10(int level){
        int res = 1;
        while(level > 0){
            res = res *10;
            level --;
        }
        return res;
    }

    public ListNode getListFromNum(BigInteger num){
        String strNum = num.toString();
        int val = Integer.valueOf(strNum.substring(strNum.length() - 1));
        strNum = strNum.substring(0, strNum.length() -1);
        ListNode listNode = new ListNode(val);
        ListNode listNodeNext = listNode;
        while (strNum.length() > 0){
            int val1 = Integer.valueOf(strNum.substring(strNum.length() - 1));
            strNum = strNum.substring(0, strNum.length() -1);
            ListNode listNode1 = new ListNode(val1);
            listNodeNext.next = listNode1;
            listNodeNext = listNode1;
        }
        return listNode;
    }


     //Definition for singly-linked list.
    public static class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
     }
}
