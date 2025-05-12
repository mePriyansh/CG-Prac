import java.util.*;
public class RotateList {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>(Arrays.asList(10,
20, 30, 40, 50));
rotateList(list, 2);
System.out.println("Rotated List: " + list);
}
public static <T> void rotateList(List<T> list, int
positions) {
int size = list.size();
positions = positions % size;
List<T> tempList = new ArrayList<>(list.subList(size -
positions, size));
tempList.addAll(list.subList(0, size - positions));
list.clear();
list.addAll(tempList);
}
}