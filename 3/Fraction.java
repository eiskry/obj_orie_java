import java.util.*;
import java.io.*;

public class Fraction {
    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    //culc x^y;
    static double power(int x, int y){
        double answer =1;
        for (int i=0;i<y;i++){
            answer *=x;
        }
        return answer;
    }

    static double calcu(int m, int n) {
        // double m = (double)x;
        // double n = (double)y;
        double q = 0;
        double q_ = 0;
        for (int i=0; i<40; i++) {
            System.out.println("No."+i);
            int tmp_q =m/n; //暫定的商
            System.out.println("tmp_q: "+tmp_q);
            int tmp_r =m%n; //暫定的余り
            System.out.println("tmp_r: "+tmp_r);
            System.out.println(power(10, i));
            double add =(double)tmp_q/power(10, i);
            System.out.println("add: "+add);
            q = q_ + add; //解
            System.out.println("q: "+q);
            System.out.println("___________");

            //余りが0
            if(tmp_r==0){
                return q;
            }
            //同じ余りの値が出現
            else if(map.containsKey(tmp_r)){
                return q;
            }
            //同じ余りではない→メモ
            else {
                map.put(tmp_r, tmp_r);
            }

            //次の除算の準備
            m=10*tmp_r;
            q_=q;
        }
        //無限小数
        return (double)m/(double)n;
    }

    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (args.length == 2) {
            Integer inte1 = Integer.valueOf(args[0]);
            Integer inte2 = Integer.valueOf(args[1]);
            int i1 = inte1.intValue();
            int i2 = inte2.intValue();
            System.out.println("Calculate: "+ i1+" / "+i2);
            double final_answer=calcu(i1,i2);
            System.out.println("Answer: "+final_answer);
        } else System.out.println("Please input two number!");
    }
}