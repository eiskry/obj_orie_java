import java.io.*;
import java.util.*;

class FileWordCount {
    // 指定した名前のファイルから読むScannerを作って返すクラスメソッド
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
        Scanner input = fileScanner(args[0]);
        int count = 0;
        while (input.hasNext()) {
            input.next();  // トークン(単語)をひとつ読む．読んだ結果は使わない．
            count++;
        }
        System.out.println (count + " words.");
    }
}