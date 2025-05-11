import java.io.*;
public class CompareAll {
public static void main(String[] args) throws IOException {
String str = "hello";
int count = 1000000;
long start1 = System.nanoTime();
StringBuilder sbd = new StringBuilder();
for (int i = 0; i < count; i++) sbd.append(str);
long end1 = System.nanoTime();
long start2 = System.nanoTime();
StringBuffer sbf = new StringBuffer();
for (int i = 0; i < count; i++) sbf.append(str);
long end2 = System.nanoTime();
BufferedReader br1 = new BufferedReader(new
FileReader("largefile.txt"));
long wordCount1 = 0;
String line;
long start3 = System.nanoTime();
while ((line = br1.readLine()) != null) {
wordCount1 += line.split("\\s+").length;
}
long end3 = System.nanoTime();
br1.close();
BufferedReader br2 = new BufferedReader(new InputStreamReader(new
FileInputStream("largefile.txt"), "UTF-8"));
long wordCount2 = 0;
long start4 = System.nanoTime();
while ((line = br2.readLine()) != null) {
wordCount2 += line.split("\\s+").length;
}
long end4 = System.nanoTime();
br2.close();
System.out.println("Builder time: " + (end1 - start1));
System.out.println("Buffer time: " + (end2 - start2));
System.out.println("FileReader words: " + wordCount1 + " Time: " +
(end3 - start3));
System.out.println("InputStreamReader words: " + wordCount2 + "
Time: " + (end4 - start4));
}
}