public class insertLL {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }
    static void insertAtMId(int x) {
        Node newNode = null;
        Node ptr = null;
        if (head == null) {
            head = new Node(x);

        } else {
            newNode = new Node(x);
            ptr = head;
            int len = 0;

            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
            int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
            ptr = head;

            while (count-- > 1) {
                ptr = ptr.next;
            }

        }

        newNode.next = ptr.next;

        ptr.next = newNode;

    }
    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }
    public static void main (String[] args){
        head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println("Linked list before "+
                "insertion: ");
        display();
        int x = 3;
        insertAtMId(x);

        System.out.println("\nLinked list after"+
                " insertion: ");
        display();
    }
}