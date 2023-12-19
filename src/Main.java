public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.getShape(ShapeEnum.SQUARE);
        square.draw();
    }
}