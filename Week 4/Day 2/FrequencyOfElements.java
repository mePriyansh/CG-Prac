import java.util.*;
public class FrequencyOfElements {
public static void main(String[] args) {
List<String> inputList = Arrays.asList("apple",
"banana", "apple", "orange");
Map<String, Integer> frequencyMap =
getFrequencyMap(inputList);
System.out.println(frequencyMap);
}
public static <T> Map<T, Integer> getFrequencyMap(List<T>
list) {
Map<T, Integer> map = new HashMap<>();
for (T element : list) {
map.put(element, map.getOrDefault(element, 0) + 1);
}
return map;
}
}