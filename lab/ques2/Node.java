package lab.ques2;

import java.util.*;

public class Node {
    private  String name;
    // Node[] children = new Node[10] ;
    ArrayList<Node> children = new ArrayList<Node>();
    
    Node(){
        // this.name=name;
        this.children = new ArrayList<>();
    }

    void setText(String name){
        this.name = name;
    }
    void add(Node child){
        children.add(child);
    }
}
