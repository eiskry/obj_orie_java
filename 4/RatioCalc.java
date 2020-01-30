import java.util.Deque;   // ←忘れがちなので注意．

public class RatioCalc extends OOGCalc<RatioCalc.Rat> {
    // 後のTreeCalcのために，static なインナークラスにしておくと，
    // RatioCalcのインスタンスを作らなくてもRatのインスタンスを作れる．
    // (名前がぶつからないこと以外は，RatioCalcの外にRatクラスを定義するのとほぼ同じ．)
    static class Rat implements Numeric<Rat> {
        Ratio ratio;
        Rat(int i) { ratio = new Ratio(i, 1); }
        Rat(Ratio r) { ratio = r; }
        public Rat add(Rat r) { return new Rat(ratio.add(r.ratio)); }
	...
    }
    protected Rat fromInt(int v) {
        ...
    }
    class NoOp extends Op {
        ...
    }
    String[][] alias = {{"足す", "+"}, {"引く", "-"}, {"かける", "*"}, {"割る", "/"},
                        {"から", "noop"}, {"と", "noop"}, {"を", "noop"}, {"で", "noop"}};
    RatioCalc() {
        ...
    }
    public static void main(String[] args) {
        new RatioCalc().run();
    }
}