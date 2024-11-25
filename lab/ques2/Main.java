package lab.ques2;

public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton();
        Node root = new Node();
        root.setText("HTML");
        Node head = new Node();
        head.setText("Head");
        Node body = new Node();
        body.setText("Body");

        root.add(head);
        root.add(body);

    }
}
