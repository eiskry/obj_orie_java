import java.util.*;

class ListTest {
  public static void main(String[] args) {
    List<String> list = new LinkedList<String>();
    for (int i = 0;i < args.length; i++) {
      list.add(args[i]);
    }
    System.out.println(list.size() + " words.");
  }
}