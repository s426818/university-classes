import figures.Rectangle;

public class App {

    void print(Object obj){
        System.out.print(obj);
    }
    public static void main(String[] args) throws Exception {
        App instance = new App();
        Rectangle rectangle = new Rectangle(12, 16);
        instance.print(rectangle.circuit());
    }
}
