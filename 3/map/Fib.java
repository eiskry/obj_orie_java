public class Fib {
    static int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2)) % 10000;
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long start = System.nanoTime();
        int value = fib(n);
        long end = System.nanoTime();
        System.out.println("fib(" + n + ") mod 10000 = " + value);
        System.out.println((end - start) / 1000 + "us");
    }
}