public class FibLog2 {
    private static int trunc(int x) { return x % 10000; }
    // 2x2の行列を，int[][]で表す.
    private static int[][] matmult2x2(int[][] a, int[][] b) {
            int[][] result = {
                {trunc(a[0][0] * b[0][0] + a[0][1] * b[1][0]),
                 trunc(a[0][0] * b[0][1] + a[0][1] * b[1][1])},
                {trunc(a[1][0] * b[0][0] + a[1][1] * b[1][0]),
                 trunc(a[1][0] * b[0][1] + a[1][1] * b[1][1])}};
            return result;
        }

        private static int[][] pow(int n, int[][]a, int[][]m) {
    // 引数は，n, 行列 A, 行列 M if (n == 0) {
        if (n==0){
                return m;
        }
        else if (n % 2 == 1) {
                return pow(n / 2, matmult2x2(a, a), matmult2x2(m, a));
            } else {
                return pow(n / 2, matmult2x2(a, a), m);
            }
        }
        public static int fib(int n) {
            int[][] a = {{1, 1},
                          {1, 0}},
                m = {{1, 0},
                     {0, 1}};
            return pow(n, a, m)[0][0];
        }
        public static void main(String[] args) { int n = Integer.parseInt(args[0]); long start = System.nanoTime();
            int value = fib(n);
            long end = System.nanoTime();
            System.out.println("fib(" + n + ") mod 10000 = " + value); System.out.println((end - start) / 1000 + "us");
        }
    }