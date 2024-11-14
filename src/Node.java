public class Node {
    public Node next = null;
    private final Object data;

    public Node(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }
}
