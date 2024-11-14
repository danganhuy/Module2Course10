public class Exercise3 {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0);
        list.add(28);
        list.add(337);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(12);
        System.out.println("List 1: " + list);

        System.out.println("Removed value: " + list.remove(3));
        System.out.println("List 2: " + list);

        MyList<Integer> list2 = list.copy();
        list2.clear();
        list2.add(1);
        System.out.println("List 3: " + list2);

        System.out.println("Index of value 337: " + list.indexOf(337));
    }
}
