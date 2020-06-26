package LinkedLists.Easy;

/**
 * AddTwoNumbers_2
 */
public class AddTwoNumbers_2 {

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;


        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        ListNode ans = new AddTwoNumbers_2().addTwoNumbers(a, d);
       
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
           return null;

         int carry = 0;  
         ListNode preHead = new ListNode(-1);
         ListNode current = preHead;
         while(l1 != null || l2 != null){
             int l1Val =  l1 != null ? l1.val : 0;
             int l2Val = l2 != null ? l2.val : 0;
             int sum = l1Val + l2Val + carry;
             carry = 0;
             ListNode tmp;
             if(sum < 10){
                tmp = new ListNode(sum);
             }else{
                 int val = sum % 10;
                 carry = sum / 10;
                 tmp = new ListNode(val);
             }
             current.next =  tmp;
             current = current.next;
             if(l1 != null) 
                 l1 = l1.next;
             if(l2 != null) l2 = l2.next;
             
         }  
         if(carry > 0){
             ListNode tmp = new ListNode(carry);
             current.next = tmp;
         }
        
        return preHead.next;
    }
}