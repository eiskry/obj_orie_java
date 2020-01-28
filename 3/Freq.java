import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.*;
 
public class Freq {
    static Scanner fileScanner(String fileName) {
        Scanner value = null;
        try {
            value = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("ファイル" +  fileName + "は存在しません。");
            System.exit(1);
        }
        return value;
    }
    public static void main(String[] args) {
        // Mapの宣言
        Map<String, Integer> map = new TreeMap<String, Integer>();
        Scanner input = fileScanner(args[0]);
        input.useDelimiter("[^a-zA-Z']+");

        while (input.hasNext()) {
            int add =0;
            if (map.containsKey(input.next())){
                add = map.get(input.next())+1;
                map.put(input.next(), add);
            }
            else {
                map.put(input.next(), 1);
            }
        }
        
        // // keySetを使用してMapの要素数分ループする
        // for (int nKey : map.keySet())
        // {
        //     System.out.println(map.get(nKey));
        // }
    }
 
}