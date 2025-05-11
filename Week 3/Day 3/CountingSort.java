public class CountingSort {
public static void countingSort(int[] arr, int maxAge) {
int[] count = new int[maxAge + 1];
int[] output = new int[arr.length];
for (int age : arr)
count[age]++;
for (int i = 1; i <= maxAge; i++)
count[i] += count[i - 1];
for (int i = arr.length - 1; i >= 0; i--) {
output[count[arr[i]] - 1] = arr[i];
count[arr[i]]--;
}
for (int i = 0; i < arr.length; i++)
arr[i] = output[i];
}
}