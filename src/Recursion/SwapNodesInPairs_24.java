package Recursion;

import LinkedLists.Easy.ListNode;
import sun.net.www.content.text.plain;

public class SwapNodesInPairs_24 {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        new SwapNodesInPairs_24().swapPairs(a);
    }

    public ListNode swapPairs(ListNode head) {
        ListNode curr =  head;
        swapFirstAndSecond(curr);
        return curr;
    }

    private void swapFirstAndSecond(ListNode node){
         if(node == null)
            return;

         ListNode prev = node;
         ListNode curr =  prev.next;
         ListNode next =  curr.next;

         curr.next = prev;
         prev.next =  next;
         swapFirstAndSecond(curr.next.next);
    }
    
}