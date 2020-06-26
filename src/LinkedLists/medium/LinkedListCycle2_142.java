package LinkedLists.medium;

import java.util.HashSet;
import java.util.Set;

import LinkedLists.Easy.ListNode;

/**
 * LinkedListCycle2_142
 */
public class LinkedListCycle2_142 {
     public static void main(String[] args) {
         ListNode a = new ListNode(3);
         ListNode b = new ListNode(2);
         ListNode c = new ListNode(0);
         ListNode d = new ListNode(-4);

         a.next = b;
         b.next = c;
         c.next =d;
         d.next = b;
         ListNode node = new LinkedListCycle2_142().detectCycle(a);
         System.out.println(node);
     }
    
     /* 
        using hash
     */
    public ListNode detectCycle_normal(ListNode head) {
         Set<ListNode> hashMap = new HashSet<ListNode>();
         ListNode current =  head;
         while(current != null){
            if(hashMap.contains(current))
               return current;
            else 
               hashMap.add(current);

            current = current.next;   
               
         }
         return null;

    }

    /*
        using two pointer
    */
    public ListNode detectCycle(ListNode head) {
       if(head == null || head.next == null || head.next.next == null)
          return null;

       ListNode fast = head.next.next;
       ListNode slow = head.next;
       
       while(fast != slow){
           if(fast.next == null || fast.next.next == null || slow ==null)
              return null;

           fast = fast.next.next;
           slow = slow.next;   
       }

       ListNode interSection = fast;
       ListNode first = head;
       while(interSection != first){
           interSection =  interSection.next;
           first =  first.next;
       }
       return first;

   }
}