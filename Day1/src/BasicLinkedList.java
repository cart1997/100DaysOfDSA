import java.util.LinkedList;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addLast(19); // it will add end of the list
        ll.addFirst(0); // it will add beginning of the list
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
    }
}
