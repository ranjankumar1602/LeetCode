class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= this.size) {
            return -1;
        }
        Node temp = this.head;
        while(index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    
    private Node getNode(int index){
        Node curr = head;
        while(index-- > 0){
            curr = curr.next;
        }
        
        return curr;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(this.size == 0){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(this.size == 0){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > this.size) {
            return;
        }
        
        if(index == 0){
            addAtHead(val);
        }
        else if(index == this.size){
            addAtTail(val);   
        }
        else{
            Node prev = getNode(index-1);
            Node next = prev.next;
            Node curr = new Node(val);
            prev.next = curr;
            curr.next = next;
            this.size++;
        }
    }
    
    private void deleteFirst(){
        if(this.size == 0) {
            return;
        }else if(this.size == 1) {
            this.head = null;
            this.tail = null;
        }else {
            Node curr = this.head;
            Node next = curr.next;
            curr.next = null;
            this.head = next;
        }
        this.size--;
    }
    
    private void deleteLast(){
        if(this.size == 0) {
            return;
        }else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
        else{
            Node secondLast = getNode(this.size - 2);
            secondLast.next = null;
            this.tail = secondLast;
        }
        this.size--;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.size) {
            return;
        }
        if(index == 0){
            deleteFirst();
        }else if(index == this.size-1) {
            deleteLast();   
        }else{
            Node prev = getNode(index-1);
            Node curr = prev.next;
            Node next = prev.next.next;
            prev.next = next;
            curr.next = null;
            this.size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
