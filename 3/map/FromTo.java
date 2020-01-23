import java.util.*;

class FromTo {
    private static void setToMap(Map<String,Integer> map, String[] args) {
        for (int i = 0;i < args.length; i += 2) {
            map.put(args[i], Integer.parseInt(args[i + 1]));
        }
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] defaultValues = {"--from", "1", "--to", "10", "--step", "1"};
        // 初期値を与えておく
        setToMap(map, defaultValues);

        // コマンドライン引数でmapを更新
        setToMap(map, args);

        // 値を取り出す
        int from = map.get("--from");
        int to = map.get("--to");
        int step = map.get("--step");
        for (int i = from; i <= to; i += step) {
           System.out.println(i);
        }
    }
}