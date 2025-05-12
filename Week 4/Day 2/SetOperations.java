import java.util.*;
public class SetOperations {
public static void main(String[] args) {
Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2,
3));
Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4,
5));
Set<Integer> union = new HashSet<>(set1);
union.addAll(set2);
System.out.println("Union: " + union);
Set<Integer> intersection = new HashSet<>(set1);
intersection.retainAll(set2);
System.out.println("Intersection: " + intersection);
}
}