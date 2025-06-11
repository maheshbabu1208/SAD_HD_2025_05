package SOLID;

public class OCP_01 {

   public interface DiscountStrategy {
        double calculate(double amount);
    }


    public static class RegularDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return amount * 0.1;
        }
    }

    public static class PremiumDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return amount * 0.2;
        }
    }

    public static class GoldDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return amount * 0.3;
        }
    }

   
    public static class DiscountCalculator {
        private DiscountStrategy strategy;

        public DiscountCalculator(DiscountStrategy strategy) {
            this.strategy = strategy;
        }

        public double calculateDiscount(double amount) {
            return strategy.calculate(amount);
        }
    }

    public static void main(String[] args) {
        DiscountCalculator regularCalc = new DiscountCalculator(new RegularDiscount());
        DiscountCalculator premiumCalc = new DiscountCalculator(new PremiumDiscount());
        DiscountCalculator goldCalc = new DiscountCalculator(new GoldDiscount()); 

        System.out.println("Regular Discount: " + regularCalc.calculateDiscount(100.0));
        System.out.println("Premium Discount: " + premiumCalc.calculateDiscount(100.0));
        System.out.println("Gold Discount: " + goldCalc.calculateDiscount(100.0)); 
    }
}