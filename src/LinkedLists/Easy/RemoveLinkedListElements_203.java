package LinkedLists.Easy;

public class RemoveLinkedListElements_203 {
    
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode ans = new RemoveLinkedListElements_203().removeElements(node, 6);
        System.out.print(ans);
    }


    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
          return null;
        if(head.next == null && head.val == val)
            return null;  

        ListNode current = head;
        while(current.next != null){
            if(current.next.val == val){
                current.next =  current.next.next;
                break;
            }    
            else
            current =  current.next;   
        }  

        return head;
        
    }
}