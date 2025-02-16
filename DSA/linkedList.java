package DSA;

// import org.w3c.dom.Node;

public class linkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value; // value
            this.next = next; // reference to next node
        }
    }


    private Node head;
    private Node tail;

    private int size;

    public linkedList(){
        this.size = 0;
    }

    // INSERTION

    // insert at first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
        if(tail == null){
            tail = head;
        }
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        // go to the node before the index from head
        
        Node temp = head;
        
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;    
    }

    // DELETION

    public int deleteFirst(){
        int removed = head.value;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return removed;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int removed = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return removed;
    }

    public int deleteAtIndex(int index){
        if(index == 0){return deleteFirst();}
        if(index == size-1){return deleteLast();}
        
        Node prevNode = getNode(index-1);
        int removed = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return removed;

    }

    public int find(int val){
        Node node =head;
        for(int i=0;i<size;i++){
            if(node.value == val){
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node getNode(int index){  // used to get the node at the passed index
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertAtIndex(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println(list.find(2));
    }

    
}


