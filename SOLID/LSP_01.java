package SOLID;

public class LSP_01 {

   public static class Rectangle {
        protected int width;
        protected int height;

        public Rectangle(int width, int height) {
            setWidth(width);
            setHeight(height);
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getArea() {
            return width * height;
        }
    }

    public static class Square {
        private int size;

        public Square(int size) {
            setSize(size);
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public int getArea() {
            return size * size;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Square square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
