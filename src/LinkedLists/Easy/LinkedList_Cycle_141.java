package LinkedLists.Easy;

public class LinkedList_Cycle_141 {
     public static void main(String[] args) {
         
     }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
           return false;

        ListNode fast = head.next.next;
        ListNode slow =  head.next;
        
        while(slow != null && fast.val != slow.val){
            if(fast == null || fast.next == null)
              return false;

            slow = slow.next;
            fast =  fast.next.next;  
        }
        return true;
    }
}