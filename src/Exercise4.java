import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {
        MyLinkedList<Integer> llist = new MyLinkedList<>(0);
        llist.addLast(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addLast(4);
        llist.addLast(5);
        llist.addLast(6);
        llist.addLast(7);
        llist.addLast(8);
        llist.addLast(9);
        System.out.println("List 1: " + llist);

        llist.addFirst(45);
        llist.addFirst(17);
        llist.addFirst(8);
        System.out.println("List 2: " + llist);

        MyLinkedList<Integer> llist2 = llist.copy();
        System.out.println("Removed value: " + llist2.remove(5));
        System.out.println("Removed value: " + llist2.remove(5));
        System.out.println("Removed value: " + llist2.remove(5));
        System.out.println("List 3: " + llist2);
        System.out.println("List 4: " + llist);

        Object temp = llist.get(6).getData();

        System.out.println("Value of 3 is removed?: " + llist.remove(3));
        System.out.println("Value of 3 is removed?: " + llist.remove(3));

        System.out.println("List 5: " + llist);
        System.out.println("List size: " + llist.size());

        System.out.println("First of list: " + llist.getFirst().getData());
        System.out.println("Last of list: " + llist.getLast().getData());

        System.out.println("List contain 5: " + llist.contains(5));
        System.out.println("List contain 555: " + llist.contains(555));
        System.out.println();

        
    }
}
