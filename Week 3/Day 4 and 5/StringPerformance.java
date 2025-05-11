public class StringPerformance {
public static void main(String[] args) {
int count = 1000000;
long start1 = System.nanoTime();
StringBuffer sbf = new StringBuffer();
for (int i = 0; i < count; i++) sbf.append("hello");
long end1 = System.nanoTime();
long start2 = System.nanoTime();
StringBuilder sbd = new StringBuilder();
for (int i = 0; i < count; i++) sbd.append("hello");
long end2 = System.nanoTime();
System.out.println("StringBuffer time: " + (end1 - start1));
System.out.println("StringBuilder time: " + (end2 - start2));
}
}
