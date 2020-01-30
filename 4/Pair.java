public class Pair<E> {
    E a, b;
    Pair(E a, E b) {
        this.a = a;
        this.b = b;
    }
    public E getFirst() { return a; }
    public E getSecond() { return b; }

    public static void main(String[] args) {
        // テストプログラム

        Pair<Integer> i = new Pair<Integer>(1, 2);
        System.out.println(i.getFirst());

        Pair<String> s = new Pair<String>("foo", "bar");
        System.out.println(s.getSecond());
    }
}