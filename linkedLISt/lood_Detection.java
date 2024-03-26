import java.util.HashSet;

public class lood_Detection {

    static Node head;
    static class Node{
        int data;
        Node next;
        int flag;

        Node(int d ){
            data = d;
            next= null;
        }
    }
    static public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }
    static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<>();
        while(h != null){
            if(s.contains(h)){
                return true;

            }
            s.add(h);
            h= h.next;
        }
        return false;
    }
    public static void main(String[] args){
        lood_Detection ll = new lood_Detection();
        ll.push(20);
        ll.push(21);
        ll.push(26);
        ll.push(28);
        ll.push(29);
        ll.head.next.next.next.next = ll.head;
        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}