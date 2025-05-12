import java.io.*;
public class ImageToByteArray {
public static void main(String[] args) {
String inputImage = "input.jpg";
7
String outputImage = "output.jpg";
try (ByteArrayOutputStream byteArrayOutputStream =
new ByteArrayOutputStream();
FileInputStream fileInputStream = new
FileInputStream(inputImage);
ByteArrayInputStream byteArrayInputStream =
new
ByteArrayInputStream(byteArrayOutputStream.toByteArray());
FileOutputStream fileOutputStream = new
FileOutputStream(outputImage)) {
byte[] buffer = new byte[1024];
int bytesRead;
while ((bytesRead =
fileInputStream.read(buffer)) != -1) {
byteArrayOutputStream.write(buffer, 0,
bytesRead);
}
byte[] imageBytes =
byteArrayOutputStream.toByteArray();
fileOutputStream.write(imageBytes);
System.out.println("Image successfully
converted to byte array and saved.");
} catch (IOException e) {
e.printStackTrace();
}
}
}