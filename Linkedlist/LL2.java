package Linkedlist;

public class LL2 {

    Node head;

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }
    public void insertlast(int value){
        Node node = new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }
    public void insertmid(int value,int after){
            Node p = find(after);

            if(p==null){
                System.out.println("does not exist");
                return;
            }
            Node node = new Node(value);
            node.next=p.next;
            node.prev=p;
            p.next=node;
            if(node.next!=null){
                node.next.prev=node;
            }
    }
    public Node find(int value){
        Node node = head;
        while(node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void revdisplay(){
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.prev;
        }
        System.out.println("END");
    }
    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
