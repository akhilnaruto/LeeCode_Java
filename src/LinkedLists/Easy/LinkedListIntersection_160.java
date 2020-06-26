package LinkedLists.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * LinkedListIntersection_160
 */
public class LinkedListIntersection_160 {

    public static void main(String[] args) {
         
      //ListNode node = new LinkedListIntersection_160().getIntersectionNode(headA, headB)
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA == null || headB == null) return null;

         ListNode pointA = headA;
         ListNode pointB = headB;

         while(true){
             if(pointA == pointB)
                return pointA;
            if(pointA == null)
               pointA = headB;
            else
               pointA = pointA.next;
              

            if(pointB == null)
                pointB = headA ; 
            else
               pointB = pointB.next;
         }         
        
    }
}