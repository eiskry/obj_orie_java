import java.util.*;
import java.io.*;

class Fraction{

    static long calcu(int m, int n){
        
    }
    public static void main(String[] args){
        if (args.length == 2) {
            Integer inte1 = Integer.valueOf(args[0]);
            Integer inte2 = Integer.valueOf(args[1]);
            int i1 = inte1.intValue();
            int i2 = inte2.intValue();
            System.out.println("Calculate "+ i1+" / "+i2);
        } else System.out.println("Please input two number!");
    }   
}