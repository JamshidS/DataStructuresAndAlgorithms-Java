public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.setHead(new SinglyLinkedList.ListNode(10));
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(8);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(11);
        sll.getHead().next = second;//10--->1
        second.next = third;//10--->1-->8
        third.next = fourth;//10-->1-->8-->11->null

//        SinglyLinkedList.ListNode current = sll.getHead();
//        while (current!=null){
//            System.out.print(current.data+ "-->");
//            current = current.next;
//        }
//        System.out.println("null");


        System.out.println(sll.length(sll));
        System.out.println("_________________________");
        sll.firstNode(25);
        SinglyLinkedList.ListNode current1 = sll.getHead();
        while (current1!=null){
            System.out.print(current1.data+ "-->");
            current1 = current1.next;
        }
    }
}