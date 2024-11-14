public class Exercise1 {
    // [Thực hành] Triển khai lớp List đơn giản
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();

        listInteger.add(18);
        listInteger.add(2);
        listInteger.add(33);
        listInteger.add(24);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);

        System.out.println("element 1: "+ listInteger.get(1));
        System.out.println("element 3: "+ listInteger.get(3));
        System.out.println("element 2: "+ listInteger.get(2));
        System.out.println("element 5: "+ listInteger.get(5));
        System.out.println("element 0: "+ listInteger.get(0));
    }
}
