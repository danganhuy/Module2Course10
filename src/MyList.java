import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public MyList<E> copy() {
        MyList<E> copy = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            copy.add(elements[i]);
        }
        return copy;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public void add(Object o) {
        ensureCapacity(size);
        elements[size++] = o;
    }

    public void ensureCapacity(int minCap) {
        if (minCap > elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
            ensureCapacity(minCap);
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (int i = 0; i < size - 1; i++) {
            s.append(elements[i]).append(", ");
        }
        s.append(elements[size - 1]).append("}");
        return s.toString();
    }
}
