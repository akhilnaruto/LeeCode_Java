package LinkedLists.medium;

import LinkedLists.Easy.ListNode;
import apple.laf.JRSUIConstants.Widget;

public class OddEvenLinkedList_328 {
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next =c;
        c.next = d;
        ListNode ans = new OddEvenLinkedList_328().oddEvenList(a);
        System.out.print(ans);
        
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null ) return null;

        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = odd.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next =  even.next.next;

            odd = odd.next;
            even  = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}