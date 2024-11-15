public class Exercise2 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(5);

        linkedList.addFirst(7);
        linkedList.addFirst(9);
        linkedList.addFirst(8);
        linkedList.addFirst(12);
        linkedList.addFirst(4);

        System.out.println(linkedList);

        linkedList.add(4, 1666);
        System.out.println("List after adding some elements");
        System.out.println(linkedList);
    }
}
