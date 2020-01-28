import java.util.*;

public class FibLog {
    static int fib(int n) {
        if (n<2){
            return 1;
        } else {
            int [][] base={{0,1},{1,1}};
            int [][] temp={{0,1},{1,1}};
            int [][] result={{0,1},{1,1}};
            for (int l=3;l<n-1;l++){
                for (int x=0;x<2;x++){
                    for (int y=0;y<2;y++){
                        temp[x][y]=result[x][y];
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            result[i][j] = base[i][k] * temp[k][j] + result[i][j];
                        }
                    }
                }
            }
            return ((result[0][0])+2*result[0][1])%10000;
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long start = System.nanoTime();
        int value = fib(n);
        long end = System.nanoTime();
        System.out.println("fib(" + n + ") mod 10000 = " + value);
        System.out.println((end - start) / 1000 + "us");
        // for (int x=0;x<2;x++){
        //     for (int y=0;y<2;y++){
        //     System.out.print(base[x][y]);
        //     }
        // }
    }
}