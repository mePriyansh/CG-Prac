import java.util.*;
public class SetSubset {
7
public static void main(String[] args) {
Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3,
4));
System.out.println("Set1 is a subset of Set2: " +
set2.containsAll(set1));
}
}