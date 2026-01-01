public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Simple Calculator - 2026");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 × 3 = " + calc.multiply(5, 3));
        System.out.println("5 ÷ 3 = " + calc.divide(5, 3));
    }
}