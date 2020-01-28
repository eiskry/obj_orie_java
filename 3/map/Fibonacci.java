import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    public int fib(int n) {
        if ( n <= 2 ) {
            return 1;
        } else if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int result = fib(n-1) + fib(n-2);
            map.put(n, result);
            System.err.println("Calculate once for " + n);
            return result;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(10));
        System.out.println(f.fib(15));
    }

}