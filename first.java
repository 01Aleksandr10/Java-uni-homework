public class first {
    interface Shape {
        int getArea();
    }

    static class Rectangle implements Shape {
        private final int width;
        private final int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }

    static class Square implements Shape {
        private final int side;

        public Square(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }
    }

    public class LSPComplianceExample {
        public static void useShape(Shape shape) {
            System.out.println("Площадь фигуры: " + shape.getArea());
        }

        public static void main(String[] args) {
            useShape(new Rectangle(5, 4)); // → 20
            useShape(new Square(4));       // → 16
        }
    }
}
