public class DemoGeometric {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle("Прямоугольник","Синий",5,6);
        System.out.println(f1+" "+f1.getLength()+"x"+f1.getWidth()+" Площадь = "+f1.Area());
    }
}
class Shape{
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
    @Override
    public String toString(){
        return ("Фигура: "+getShape()+" "+getColor());
    }
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
    public int Area(){
        return getLength()*getWidth();
    }
}