public class prime {
    public static void main(String[] args) {
        for (int number = 2; number <= 30; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / divisor; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
