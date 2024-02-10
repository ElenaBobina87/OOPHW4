package HW4.OOPHW4;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> t = new GBLinkedList<>();
        t.addFirst(1);
        t.addLast(2);
        System.out.println(t.getSize());
        System.out.println(t.getElement(1));
    }
}
