package lesson_07.figure;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(14);
        shapes[1] = new Triangle(9, 3);
        shapes[2] = new Square(7);

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println("Сума площ всіх фігур: " + totalArea);
    }
}
