public class Fibonacci {
    public static void main(String[] args) {
        int lastFibonacciNum = 1;
        int currentFibonacciNum = 0;
        for (int i = 0; i < 20; i++) {
            lastFibonacciNum = (currentFibonacciNum += lastFibonacciNum) - lastFibonacciNum;
            System.out.println("Fibonacci(" + i + ") = " + currentFibonacciNum);
        }
    }
}
