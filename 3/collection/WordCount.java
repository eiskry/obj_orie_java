import java.util.*;

class WordCount {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int count = 0;
      while (input.hasNext()) {
          input.next();  // トークン(単語)をひとつ読む．読んだ結果は使わない．
          count++;
      }
      System.out.println (count + " words.");
  }
}