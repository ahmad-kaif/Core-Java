import java.util.*;

abstract class DocumentBuilder {
    protected HtmlDocument document;

    public HtmlDocument getDocument() {
        if (document == null) {
            document = new HtmlDocument();
        }
        return document;
    }
}

interface Document {
    void setRoot(Node root);
}

class HtmlDocument implements Document {
    private Node root;
    private Node head;
    private Node body;

    public HtmlDocument() {
        root = new Node("html");
        head = new Node("head");
        body = new Node("body");
        root.add(head);
        root.add(body);
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void setHeadText(String text) {
        head.setText(text);
    }

    public void setBodyText(String text) {
        body.setText(text);
    }
}

class Node {
    private String name;
    private ArrayList<Node> children;

    public Node(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void setText(String text) {
        // Implement logic to set text content of this node
    }

    public void add(Node child) {
        children.add(child);
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Done");
    }
}