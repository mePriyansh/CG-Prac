import java.io.*;
import java.util.concurrent.*;
class WriterThread extends Thread {
private PipedOutputStream out;
public WriterThread(PipedOutputStream out) {
this.out = out;
}
public void run() {
try {
out.write("Hello from Writer!".getBytes());
out.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
class ReaderThread extends Thread {
private PipedInputStream in;
public ReaderThread(PipedInputStream in) {
this.in = in;
}
public void run() {
try {
int data;
while ((data = in.read()) != -1) {
System.out.print((char) data);
}
} catch (IOException e) {
12
e.printStackTrace();
}
}
}
public class PipedStreamExample {
public static void main(String[] args) {
try {
PipedOutputStream pipedOutputStream = new
PipedOutputStream();
PipedInputStream pipedInputStream = new
PipedInputStream(pipedOutputStream);
WriterThread writerThread = new
WriterThread(pipedOutputStream);
ReaderThread readerThread = new
ReaderThread(pipedInputStream);
writerThread.start();
readerThread.start();
} catch (IOException e) {
e.printStackTrace();
}
}
}