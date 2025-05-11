class TextState {
String content;
TextState prev;
TextState next;
public TextState(String content) {
this.content = content;
}
}
class TextEditor {
private TextState head = null;
private TextState tail = null;
private TextState current = null;
private int size = 0;
private final int MAX_HISTORY = 10;
public void type(String newText) {
TextState newState = new TextState(newText);
if (current != null && current.next != null) {
current.next.prev = null;
current.next = null;
}
if (tail != null) {
tail.next = newState;
newState.prev = tail;
} else {
head = newState;
}
tail = newState;
current = newState;
size++;
if (size > MAX_HISTORY) {
head = head.next;
head.prev = null;
size--;
}
}
public void undo() {
if (current != null && current.prev != null) {
current = current.prev;
}
}
public void redo() {
if (current != null && current.next != null) {
current = current.next;
}
}
public void displayCurrentState() {
if (current != null) {
System.out.println("Current State: " + current.content);
} else {
System.out.println("No content available.");
}
}
}
public class TextEditorDemo {
public static void main(String[] args) {
TextEditor editor = new TextEditor();
editor.type("Hello");
editor.type("Hello World");
editor.type("Hello World!");
editor.displayCurrentState();
editor.undo();
editor.displayCurrentState();
editor.undo();
editor.displayCurrentState();
editor.redo();
editor.displayCurrentState();
editor.type("New Content After Undo");
editor.displayCurrentState();
for (int i = 1; i <= 15; i++) {
editor.type("Edit " + i);
}
editor.displayCurrentState();
}
}