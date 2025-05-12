import java.io.*;
public class BufferedFileCopy {
public static void main(String[] args) {
String sourceFile = "largefile.txt";
String destFile = "copiedfile.txt";
long startTime, endTime;
try (FileInputStream fis = new
FileInputStream(sourceFile);
FileOutputStream fos = new
2
FileOutputStream(destFile)) {
startTime = System.nanoTime();
int content;
while ((content = fis.read()) != -1) {
fos.write(content);
}
endTime = System.nanoTime();
System.out.println("Unbuffered copy time: " +
(endTime - startTime) + " nanoseconds.");
} catch (IOException e) {
e.printStackTrace();
}
try (BufferedInputStream bis = new
BufferedInputStream(new FileInputStream(sourceFile));
BufferedOutputStream bos = new
BufferedOutputStream(new FileOutputStream(destFile))) {
startTime = System.nanoTime();
byte[] buffer = new byte[4096];
int bytesRead;
while ((bytesRead = bis.read(buffer)) != -1) {
bos.write(buffer, 0, bytesRead);
}
endTime = System.nanoTime();
System.out.println("Buffered copy time: " +
(endTime - startTime) + " nanoseconds.");
} catch (IOException e) {
e.printStackTrace();
}
}
}
