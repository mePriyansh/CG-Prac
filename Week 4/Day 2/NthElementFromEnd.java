import java.util.*;
public class NthElementFromEnd {
public static void main(String[] args) {
LinkedList<String> list = new
LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
System.out.println("Nth element from the end: " +
findNthFromEnd(list, 2));
}
public static <T> T findNthFromEnd(LinkedList<T> list, int
n) {
int size = list.size();
4
if (n > size) {
return null;
}
return list.get(size - n);
}
}