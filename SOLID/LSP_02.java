package SOLID;

public class LSP_02 {
    
   public static class Bird {
        public void move() {
            System.out.println("The bird is moving...");
        }
    }

    public interface Flyable {
        void fly();
    }

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

    public static class Penguin extends Bird {
      
        @Override
        public void move() {
            System.out.println("The penguin is waddling...");
        }
    }

   
    public static void move(Bird bird) {
        bird.move();
        if (bird instanceof Flyable) {
            ((Flyable) bird).fly();
        }
    }

    public static void main(String[] args) {
        move(new Sparrow());
        move(new Penguin());
    }
}
