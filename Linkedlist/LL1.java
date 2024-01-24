package Linkedlist;

public class LL1 {

    private Node head;
    private Node tail;
    private int size;
    public LL1()
    {
        this.size=0;
    }

    //insert at first
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }

        size +=1;
    }
//insert at mid
    public void insertatmid(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertend(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;

        size++;
    }
    //insert at end
    public void insertend(int value){

        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertRec(int value,int index){
        head=insertRec(value,index,head);
    }
    private Node insertRec(int value,int index,Node node){
        if(index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value,index-1,node.next);
        return node;
    }

    public int delete1st(){
        if(head == null)
        {
            System.out.println("Empty Linked List");
        }
        int value = head.value;
        head=head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return value;
    }

    public int deletelast(){
        int value = tail.value;
        Node prev=get(size-2);
        tail=prev;
        prev.next=null;
        return value;
    }

    public int delete(int index){
        if(index == 0 ){
            return delete1st();
        }
        if(index == size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;

        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++)
        {
            node = node.next;
        }
        return node;
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
    private class Node {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}
