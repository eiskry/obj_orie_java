import java.util.Deque;   // ←忘れがちなので注意．

public class TreeCalc extends OOGCalc<TreeCalc.Tree> {
    RatioCalc ratcalc = new RatioCalc();
    abstract class Tree implements Numeric<Tree> {
        public Tree add(Tree t) { return new Node(ratcalc.ADD_OP, this, t); }
	...
    }
    class Leaf extends Tree {
        int value;
        Leaf(int value) { this.value = value; }
        public String toString() { return Integer.toString(value); }
        public RatioCalc.Rat eval() { return new RatioCalc.Rat(value); }
    }
    class Node extends Tree {
        RatioCalc.BinOp op;
        Tree left, right;
        Node(RatioCalc.BinOp op, Tree left, Tree right) {
	   ...
        }
	...
    }
    protected Tree fromInt(int v) {
        ...
    }
    class ShowOp extends Op {
        public String opName() { return "?"; }
	...
    }
    TreeCalc() {
        ...
    }
    public static void main(String[] args) {
        new TreeCalc().run();
    }
}