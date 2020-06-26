package LinkedLists.medium;

import LinkedLists.Easy.ListNode;

public class RemoveNthNode {
    

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next= node4;
        node4.next = node5;
       
        ListNode ans = new RemoveNthNode().removeNthFromEnd(node1, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode current = head;
         current.next = current.next.next.next;
         return head;
          
        
    }
}