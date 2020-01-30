import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int v = scanner.nextInt();
                stack.push(v);
            } else {
                String token = scanner.next();
                if (token.equals("+")) {
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    stack.push(v1 + v2);
                } else if (token.equals("-")) {
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    stack.push(v1 - v2);
                } else if (token.equals("*")) {
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    stack.push(v1 * v2);
                } else if (token.equals("/")) {
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    stack.push(v1 / v2);
                } else if (token.equals("=")) {
                    for (int p : stack) {
                        System.out.println(p);
                    }
                } else {
                    System.out.println("エラー: 誤ったトークン: " + token);
                }
            }
        }
    }
}