import java.util.*;
public class RemoveDuplicates {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>(Arrays.asList(3, 1,
2, 2, 3, 4));
removeDuplicates(list);
System.out.println("List after removing duplicates: " +
3
list);
}
public static <T> void removeDuplicates(List<T> list) {
Set<T> seen = new HashSet<>();
List<T> resultList = new ArrayList<>();
for (T element : list) {
if (!seen.contains(element)) {
seen.add(element);
resultList.add(element);
}
}
list.clear();
list.addAll(resultList);
}
}
