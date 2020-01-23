import java.util.*;

class Primes2 {
    public static void main(String[] args) {
        Set<Integer> primes = new HashSet<Integer>(); // 素数の集合
        outer: for (int i = 2; i < 100; i++) {
            for (int p : primes) {
                if (i % p == 0) {
                    // 割り切れた．iは素数でない．
                    continue outer;
                }
            }
            // 新しい素数が見つかった
            System.out.println(i);
            // iを集合に入れる
            primes.add(i);
        }
    }
}