package figures;

public class MainForFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        QTriangle qTriangle = new QTriangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(12, 4);
        Figure [] arrayOfFigures = {circle, qTriangle, rectangle};
        for(int i = 0; i< arrayOfFigures.length; i++){
            System.out.println("Obwód: " + arrayOfFigures[i].circuit());
            System.out.println("Pole: " + arrayOfFigures[i].field());
        }
    }
}
