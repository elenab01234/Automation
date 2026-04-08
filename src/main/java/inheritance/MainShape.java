package inheritance;

public class MainShape {
    public static void main(String[] args){
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
    }
}