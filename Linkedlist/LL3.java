package Linkedlist;

public class LL3 {

    Node head;
    Node tail;

    public void insertfirst(int value){
        Node node = new Node(value);
        if(head == null){
            head= node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete (int value){
        Node node = head;
        if(node == null){
            head= head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while (node!=head);

    }

    public void dispaly(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.value+" -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD ");
    }

    private class Node{
        public int value;
        public Node next;

        Node(int value){
            this.value=value;
        }
    }
}
