package LinkedLists.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindome_Linked_List_234
 */
public class Palindome_Linked_List_234 {

    public static void main(String[] args) {
          ListNode a = new ListNode(1);
          ListNode b = new ListNode(2);
          ListNode c = new ListNode(2);
          ListNode d = new ListNode(1);
          a.next = b;
          b.next =c;
          c.next = d;
          boolean ans = new Palindome_Linked_List_234().isPalindrome(a);
    }

    public boolean isPalindrome_old(ListNode head) {
        if(head == null) return false;

        List<Integer> vals = new ArrayList<Integer>();

        while(head != null){
            vals.add(head.val);
            head = head.next;
        }

      int first  = 0;
      int last =  vals.size()-1;

      while(first < last){
          if(!vals.get(first).equals(vals.get(last)))
             return false;

           first++;
           last--;  
      }  
      return true;  
    }

    public boolean isPalindrome(ListNode node){
        ListNode head = node;
        ListNode middleNode = null;
        ListNode slowNode =  node;
        ListNode fastNode = node;

        // find middle node
        while(fastNode != null){
            slowNode = slowNode.next;
            fastNode  = fastNode.next.next;
        }
        middleNode = slowNode;

        // reverse linked list from reverse node
        ListNode prevNode = null;
        middleNode =  middleNode.next;
        while(middleNode != null){
            ListNode tmpNode = middleNode.next;
            middleNode.next = prevNode;
            middleNode = tmpNode;
            prevNode =  middleNode;
        }
        return true;

    }


}