package figures;

public class QTriangle implements Figure{
    private double a;
    private double b;
    private double c;

    public QTriangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double field() {
        return (a*b)/2;
    }

    @Override
    public double circuit() {
        return a+b+c;
    }

}