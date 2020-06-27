package Medium;

public class FlattenLinkedList_430 {
    
    public static void main(String[] args) {
        
    }
    public Node flatten(Node head) {
        Node current = head;
        while(current.child == null)
           current = current.next;

        Node oldPrev = current.prev;
        Node oldNext = current.next;
        while(current.next != null){
            current.next
        }

    }
}