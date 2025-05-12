public class MultipleCatchBlocksExample {
4
 public static void main(String[] args) {
 Integer[] array = null;
 int index = 2;
 try {
 System.out.println("Value at index " + index + ": " +
array[index]);
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Invalid index!");
 } catch (NullPointerException e) {
 System.out.println("Array is not initialized!");
 }
 }
}

