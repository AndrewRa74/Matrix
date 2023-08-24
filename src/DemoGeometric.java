public class DemoGeometric {
    public static void main(String[] args) {
        Shape f1 = new Rectangle("Прямоугольник","Синий",5,6);
        System.out.println(f1);
    }
}
abstract class Shape{
    private String shape;
    private String color;
    Shape(String shape,String color){
        this.shape = shape;
        this.color = color;
    }
    public String getShape(){
        return shape;
    }
    public String getColor(){
        return color;
    }
    abstract public int getArea();
    @Override
    abstract public String toString();
}
class Rectangle extends Shape{
    private int length;
    private int width;
    Rectangle(String shape,String color,int length,int width){
        super(shape, color);
        this.length = length;
        this.width = width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getArea(){
        return getLength()*getWidth();
    }
    @Override
    public String toString(){
        return getColor()+" "+getShape()+" "+getLength()+"x"+getWidth()+" Площадью "+getArea();
    }
}