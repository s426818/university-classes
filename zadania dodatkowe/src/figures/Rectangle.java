package figures;
public class Rectangle implements Figure{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double field(){
        return length*width;
    }
    
    public double circuit(){
        return 2*(length+width);
    }
    
    public double diagonal(){
        return Math.sqrt((length*length)+(width*width));
    }
}