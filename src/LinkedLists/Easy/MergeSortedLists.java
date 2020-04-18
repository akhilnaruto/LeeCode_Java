package LinkedLists.Easy;

// 21
/*
 * Input: 1->2   2->4
   Output: 1->1->2->3->4->4
 * 
 */
public class MergeSortedLists {
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(4);

		ListNode b = new ListNode(1);
		b.next = new ListNode(3);
		b.next.next = new ListNode(4);

		ListNode ans = new MergeSortedLists().mergeTwoLists(a, b);
		System.err.println("ss");
	}

//	// through recursion
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if (l1 == null) {
//			return l2;
//		} else if (l2 == null) {
//			return l1;
//		} 
//		if(l1.val < l2.val) {
//			l1.next = mergeTwoLists(l1.next, l2);
//			return l1;
//		}
//		else {
//			l2.next = mergeTwoLists(l1, l2.next);
//			return l2;
//		}
//			
//	}
	
	// iteration
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    ListNode preHead = new ListNode(-1);
	    ListNode currNode = preHead;
	    while(l1 != null && l2 != null) {
	    	if(l1.val < l2.val) {
	    		currNode.next = l1;
	    		l1 =l1.next;
	    	}else {
	    		currNode.next =  l2;
	    		l2 = l2.next;
	    	}
	    	currNode = currNode.next;
	    }
	    if(l1 != null)
	    	currNode.next = l1;
	    if(l2 != null)
	    	currNode.next = l2;
	    return preHead.next;
	}
}
