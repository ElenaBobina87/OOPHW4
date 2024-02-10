package HW4.OOPHW4;



public class GBLinkedList<T> {

    int size = 0;
    MyNode<T> tail;
    MyNode<T> head;
    
    
    
    

    public void addFirst(T elem) {
        MyNode<T> temp = new MyNode<>();
        temp.revious = null;
        temp.data = elem;
        temp.next = head;
        if (head == null) {
            head = temp;
        } else head.revious = temp;
        size ++;
    }

    public void addLast(T elem) {
        MyNode<T> temp = new MyNode<>();
        temp.revious = tail;
        temp.data = elem;
        temp.next = null;
        if (tail == null) {
            tail = temp;
        } else tail.next = temp;
        size ++;
    }

    public int getSize() {
        return size;
    }

    

    public T getElement(int index) {
        MyNode<T> current = (MyNode<T>) head;
        for (int i = 0; i < index; i++) {
            current.getNextNode();
        }
        return current.data;  
                 
        
        
    }
    
    
}
