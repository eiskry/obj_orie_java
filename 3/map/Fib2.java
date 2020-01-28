import java.util.*;

public class Fib2 {
    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    static int fib(int n) {
        if (n < 2) {
            return 1;
        } else if (map.containsKey(n)){
            return map.get(n);
        } else {
            // int result =(map.get(n-1)+map.get(n-2)) % 10000;
            map.put(n,(map.get(n-1)+map.get(n-2)) % 10000);
            // return result;
            return map.get(n);
        }
    }
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = Integer.parseInt(args[0]);
        long start = System.nanoTime();
        int value = fib(n);
        long end = System.nanoTime();
        System.out.println("fib(" + n + ") mod 10000 = " + value);
        System.out.println((end - start) / 1000 + "us");
    }
}