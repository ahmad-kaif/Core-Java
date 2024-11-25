
public class Main {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0};

        Vector obj1 = new Vector(arr);
        Vector obj2 = new Vector(obj1);

        obj1.multiply(2);
        System.out.println(obj2.multiply(obj1));

    }
}
