public enum ShapeEnum {
    CIRCLE("Circle"),
    SQUARE("Square"),
    RECTANGLE("Rectangle");
    private final String type;

    ShapeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
