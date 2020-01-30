import java.util.*; 

class FibFast { 
	
	static int MAX = 1000; 
    static int f[]; 
	
	public static int fib(int n) 
	{ 
		if (n == 0) return 0; 	
		if (n<2) return 1; 
	
        if (f[n] != 0) return f[n]; 

		int k = (n & 1) == 1 ? (n + 1) / 2 : n / 2; 
		f[n] = (n & 1) == 1 ? ((fib(k) * fib(k) + fib(k - 1) * fib(k - 1)))%10000 
					: ((2 * fib(k - 1) + fib(k)) * fib(k))%10000; 
	
		return f[n]; 
	} 
	
	public static void main(String[] args) 
	{ 
		int n = Integer.parseInt(args[0]);
        f= new int[MAX]; 
        long start = System.nanoTime();
        int value = fib(n);
        long end = System.nanoTime();
        System.out.println("fib(" + n + ") mod 10000 = " + value);
        System.out.println((end - start) / 1000 + "us");
	} 
} 