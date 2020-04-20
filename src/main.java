import LinkedLists.Easy.ListNode;

public class main {
	public static void main(String[] args) {
       ListNode a = new ListNode(1);
       ListNode b = new ListNode(2);
       a.next = b;
       ListNode c = a;
       c = c.next;
       
       System.out.println(a.val);
       System.out.println(c.val);
	}
}
