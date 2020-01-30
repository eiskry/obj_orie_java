public class Point<E extends Number> {  // Eは型変数．Numberのサブクラスに限定
    private E x, y;
    Point(E x, E y) {
        this.x = x;
        this.y = y;
    }
    public E getX() { return x; }
    public E getY() { return y; }
    public String toString() { return "(" + x.toString() + ", " + y.toString() + ")"; }

    public static void main(String[] args) {
        // テストプログラム

        Point<Integer> p1 = new Point<Integer>(1, 2);
        System.out.println(p1);

        Point<Double> p2 = new Point<Double>(3.5, 4.1);
        System.out.println(p2);

        // Point<String> p3 = new Point<String>("foo", "bar"); // エラー
    }
}