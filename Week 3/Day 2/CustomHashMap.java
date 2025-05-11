import java.util.LinkedList;
class CustomHashMap {
private final int SIZE = 100;
private LinkedList<Entry>[] map;
class Entry {
int key;
int value;
Entry(int key, int value) {
this.key = key;
this.value = value;
}
}
public CustomHashMap() {
map = new LinkedList[SIZE];
for (int i = 0; i < SIZE; i++) {
7
map[i] = new LinkedList<>();
}
}
private int getHash(int key) {
return key % SIZE;
}
public void put(int key, int value) {
int index = getHash(key);
for (Entry entry : map[index]) {
if (entry.key == key) {
entry.value = value;
return;
}
}
map[index].add(new Entry(key, value));
}
public Integer get(int key) {
int index = getHash(key);
for (Entry entry : map[index]) {
if (entry.key == key) {
return entry.value;
}
}
return null;
}
public void remove(int key) {
int index = getHash(key);
map[index].removeIf(entry -> entry.key == key);
}
}
