package HW4.OOPHW4;



public class MyNode<T> {
    T data;
    MyNode<T> next;
    MyNode<T> revious;
         
    
    protected MyNode<T> getNextNode() {
        return this.next;
    }
    
}
