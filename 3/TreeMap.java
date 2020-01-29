import java.util.*;

public class TreeMap {
    private static Map<String,Integer> m1 = new HashMap<String, Integer>();
    private static Map<String,Integer> m2 = new HashMap<String, Integer>();
    private static Map<Integer, String> m3 = new HashMap<Integer, String>();
    public static void main(String[] args) {

        Map<String,Integer> m1 = new TreeMap<String, Integer>();
        m1.put("caa", 1);
        m1.put("aa", 1);
        m1.put("b", 1);

        System.out.println(m1); // {aa=1, b=1, caa=1}
        
        Map<String,Integer> m2 = new TreeMap<String,Integer>();
        m2.put("う", 1);
        m2.put("あ", 1);
        m2.put("い", 1);
        
        System.out.println(m2); // {あ=1, い=1, う=1}
        
        Map<Integer,String> m3 = new TreeMap<Integer, String>();
        m3.put(2, "aa");
        m3.put(3, "bb");
        m3.put(1, "cc");
        
        System.out.println(m3); // {1=cc, 2=aa, 3=bb}
    }
}
