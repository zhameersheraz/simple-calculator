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
    
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    
    public int modulo(int a, int b) {
        return a % b;
    }
    
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
    
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Simple Calculator - 2026");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 × 3 = " + calc.multiply(5, 3));
        System.out.println("5 ÷ 3 = " + calc.divide(5, 3));
        System.out.println("2 ^ 3 = " + calc.power(2, 3));
        System.out.println("10 % 3 = " + calc.modulo(10, 3));
        System.out.println("√16 = " + calc.squareRoot(16));
        System.out.println("5! = " + calc.factorial(5));
    }
}