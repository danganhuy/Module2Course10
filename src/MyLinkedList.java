public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes ++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public Object remove(int index) {
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = previous.next;
        }
        Node temp = previous.next;
        previous.next = previous.next.next;
        numNodes--;
        return temp.getData();
    }

    public boolean remove(Object data) {
        Node previous = head;
        for (int i = 0; i < numNodes - 1 && previous.next != null; i++) {
            if (previous.next.getData().equals(data)) {
                previous.next = previous.next.next;
                numNodes --;
                return true;
            }
            previous = previous.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> copy() {
        MyLinkedList<E> list = new MyLinkedList<>(head.getData());
        Node temp = head.next;
        while (temp != null) {
            list.addLast(temp.getData());
            temp = temp.next;
        }
        return list;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder s = new StringBuilder();
        s.append("{").append(temp.getData());
        while (temp.next != null) {
            temp = temp.next;
            s.append(", ").append(temp.getData());
        }
        s.append("}");
        return s.toString();
    }
}
