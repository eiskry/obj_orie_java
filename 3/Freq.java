import java.util.*;
import java.io.*;
import java.util.TreeMap;
import java.util.Map;

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

    private static void setToMap(Map<String,Integer> map, String word){
        if (map.containsKey(word)) {
            int add = map.get(word);
            add= add+1;
            map.put(word, add);
        }
        else {
            map.put(word, 1);
        }
    }

    public static void main(String[] args) {
        // Mapの宣言
        Map<String, Integer> map = new TreeMap<String, Integer>();
        Scanner input = fileScanner(args[0]);
        input.useDelimiter("[^a-zA-Z']+");

        while (input.hasNext()) {
            // int add =0;
            // if (map.containsKey(input.next())) {
            //     int add = map.get(input.next());
            //     add= add+1;
            //     map.put(input.next(), add);
            // }
            // else {
            //     map.put(input.next(), 1);
            // }
            setToMap(map, input.next());
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue()+" : " + entry.getKey());
        }
    }
 
}