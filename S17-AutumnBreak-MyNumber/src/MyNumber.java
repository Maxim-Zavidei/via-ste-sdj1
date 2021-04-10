public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getLastDigit() {
        return Math.abs(number) % 10;
    }

    public int getFirstDigit() {
        int lastDigit = number;
        while (lastDigit > 9) lastDigit /= 10;
        return lastDigit;
    }

    public boolean isDivisibleBy(int anotherInt) {
        return number % anotherInt == 0;
    }

    public int numberOfProperDivisor() {
        int counter = 1;
        for (int i = 2; i <= number / 2; i++) if (isDivisibleBy(i)) counter++;
        return counter;
    }

    public boolean isPrime() {
        return numberOfProperDivisor() == 1;
    }

    @Override
    public String toString() {
        return "" + number + (isPrime() ? " (a prime number)" : "");
    }

    public MyNumber plus(MyNumber anotherNumber) {
        return new MyNumber(number + (anotherNumber == null ? 0 : anotherNumber.getNumber()));
    }

    public boolean isPerfectNumber() {
        int divisorsSum = 1;
        for (int i = 2; i <= number / 2; i++) if (isDivisibleBy(i)) divisorsSum += i;
        return divisorsSum == number;
    }
}
