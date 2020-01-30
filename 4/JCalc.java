import java.util.*;

public class JCalc extends OOCalc {
    class NoOp extends Op {
    
    }
    String[][] alias = {{"足す", "+"}, {"引く", "-"}, {"かける", "*"}, {"割る", "/"},
                        {"から", "noop"}, {"と", "noop"}, {"を", "noop"}, {"で", "noop"}};
    
    //ops:単語辞書　Map<String, Op> ops; 
    JCalc() {
       for (String[] pair : alias) {
          ops.put("noop", new NoOp());
          ops.put("足す", ...);
       }
    }
    public static void main(String[] args) {
        new JCalc().run();
    }
}