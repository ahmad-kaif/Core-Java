
public class Main {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 6.0, 4.0};
        Vector obj = new Vector(arr);

        Vector obj2 = new Vector(obj);

        System.out.println("arr at 0 index: " + obj.get(0));
        obj.set(0, 100.0);
        System.out.println("arr at 0 index after modification: " + obj.get(0));

        System.out.println("arr at 0 index: using obj2 " + obj2.get(0));


    }
}
