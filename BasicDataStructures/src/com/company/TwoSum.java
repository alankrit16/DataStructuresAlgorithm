package com.company;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 **/
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<ListNode> ar = new ArrayList<>();
        
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstRef = l1;
        ListNode secondRef = l2;
        ListNode res = null;
        ListNode resRef = res;
        int carry = 0;
        while(l1!=null || l2!=null){
            int digSum;
            if(l1 == null){
                digSum = carry + secondRef.val;
            }else if(l2==null){
                digSum = carry + firstRef.val;
            }else{
                digSum = carry + l1.val + l2.val;
            }
            int sum = digSum%10;
            carry = digSum/10;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            ListNode temp = new ListNode(sum,null);
            if(res==null){
                res = temp;
                resRef = res;
            }else{
                resRef.next = temp;
                resRef = resRef.next;
            }
        }

        return res;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head;
        ListNode j = null;
        int count = 0;
        while(i!=null){
            if(count == n){
                j=head;
            }
            if(i.next == null){
                if(j==null){
                    head = head.next;
                }else{
                    j.next = j.next.next;
                }
            }
            i = i.next;
            if (j != null) {
                j = j.next;
            }
            count++;
        }
        return head;
    }
}
