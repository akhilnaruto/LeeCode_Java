package LinkedLists.Easy;

/*
 * 
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

		Example:
		
		Input: 1->2->4, 1->3->4
		Output: 1->1->2->3->4->4

 */
public class MergeTwoSortedLists_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode mergedList = new ListNode(-1);
         
         while(l1 != null && l2 != null) {
        	 
         }
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
