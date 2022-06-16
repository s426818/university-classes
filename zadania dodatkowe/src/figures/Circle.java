package figures;

public class Circle implements Figure {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double field() {
        return r*r*Math.PI;
    }

    @Override
    public double circuit() {
        return 2*r*Math.PI;
    }

    public double getR(){
        return r;
    }
    
}
