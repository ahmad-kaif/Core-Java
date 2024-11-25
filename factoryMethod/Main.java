
interface Product{
    void display();
}
class productA implements Product{
    public void display(){
        System.out.println("product A");
    }

}
class productB implements Product{
    public void display(){
        System.out.println("product B");
    }
}



interface Factory{
    Product factoryMethod();

}
class factoryA implements Factory{
    public Product factoryMethod(){
        return new productA();
    }
}
class factoryB implements Factory{
    public Product factoryMethod(){
        return new productB();
    }
}

public class Main{
    public static void main(String[] args) {
        Factory f = new factoryA();
        Product p = f.factoryMethod();
        p.display();
        

    }
}