public class ShapeFactory {
    public static Shape getShape(ShapeEnum type) {
        Shape shape = null;
        if (type.equals(ShapeEnum.CIRCLE)) {
            shape = new Circle();
        } else if (type.equals(ShapeEnum.RECTANGLE)) {
            shape = new Rectangle();
        } else if (type.equals(ShapeEnum.SQUARE)) {
            shape = new Square();
        }
        return shape;
    }
}
