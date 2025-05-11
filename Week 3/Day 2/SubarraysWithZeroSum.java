import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class SubarraysWithZeroSum {
public List<int[]> findZeroSumSubarrays(int[] arr) {
List<int[]> result = new ArrayList<>();
HashMap<Integer, List<Integer>> map = new HashMap<>();
int sum = 0;
for (int i = 0; i < arr.length; i++) {
sum += arr[i];
if (sum == 0) {
result.add(new int[]{0, i});
}
if (map.containsKey(sum)) {
5
for (int start : map.get(sum)) {
result.add(new int[]{start + 1, i});
}
}
map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
}
return result;
}
}
