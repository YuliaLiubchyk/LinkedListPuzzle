

public class LinkedListReverse {
    // prints content of double linked list
    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node tail = new Node("D", null);
        Node previous1 = new Node("C", tail);
        Node previous2 = new Node("B", previous1);
        Node head = new Node("A", previous2);

        System.out.println("Given Linked list");
        printList(head);
        System.out.println();
        System.out.println("Reversed linked list ");
        //printList(reverseHead);
        System.out.println();
    }

}
