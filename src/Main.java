interface Fruit{
    String color = "Red color fruit, Interface";
    void favorite();
    default void province(){
        System.out.println("Chanthaburi");
    }
}

class App implements Fruit{
    public void province(){
        System.out.println("A Interface default method");
    }
    public void favorite(){
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        App objApp = new App();
        App objApp2 = new App();

        objApp.favorite();
        objApp2.province();
    }
}