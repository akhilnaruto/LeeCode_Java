package LinkedLists.Easy;

/*
 * 206. Reverse Linked List
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

 */
public class ReverseLinkedList {

	
	public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next= node5;
        ListNode answer = new ReverseLinkedList().reverseList(node);

	}

	public ListNode reverseList_1(ListNode head) {
	   ListNode prev = null;
	   ListNode current = head;
	   while(current != null) {
		   ListNode tmpNext = current.next;
		   current.next = prev;
		   prev = current;
		   current = tmpNext;
	   }
	   return prev;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
		
		ListNode p = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	 }
}
