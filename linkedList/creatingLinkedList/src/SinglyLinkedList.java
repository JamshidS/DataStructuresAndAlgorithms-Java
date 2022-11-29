public class SinglyLinkedList {
    private  ListNode head;

    public ListNode getHead() {
        return head;
    }

    public int length(SinglyLinkedList singlyLinkedList){
        int count =0;
        ListNode current = head;

        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void firstNode(int value){
        ListNode listNode = new ListNode(value);
        listNode.next=head;
        head=listNode;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
}
