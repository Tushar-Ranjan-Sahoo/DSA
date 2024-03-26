


class DetectNthNode{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void printNthFromLast(int N){
        int len = 0 ;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        if(len < N){
            return;
        }

        temp = head;
        for(int i = 1; i<len-N+1;i++){
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        DetectNthNode llist = new DetectNthNode();
        llist.push(20);
        llist.push(2);
        llist.push(0);
        llist.push(250);
        llist.push(420);
        llist.push(260);

        llist.printNthFromLast(4);
    }
}