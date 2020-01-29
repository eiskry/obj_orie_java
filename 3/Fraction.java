import java.util.*;
import java.io.*;

public class Fraction{

    //culc x^y;
    static int power(int x, int y){
        int answer =1;
        for (int i=0;i<y;i++){
            t *=x;
        }
        return answer;
    }
    static double calcu(int x, int y) {
        double m = (double)x;
        double n = (double)y;
        while(int i=0;i<15;i++){
            int tmp_q =m/n;
            int tmp_r =m-n*q;
            double q=tmp_q/power(10, i);
            
        }

        // if((m%n)==0){
            double answer = (double)m/(double)n;
        //     return answer;
        // } else if {

        // }
    }
    public static void main(String[] args){
        if (args.length == 2) {
            Integer inte1 = Integer.valueOf(args[0]);
            Integer inte2 = Integer.valueOf(args[1]);
            int i1 = inte1.intValue();
            int i2 = inte2.intValue();
            System.out.println("Calculate "+ i1+" / "+i2);
            double final_answer=calcu(i1,i2);
            System.out.println(final_answer);
        } else System.out.println("Please input two number!");
    }   
}