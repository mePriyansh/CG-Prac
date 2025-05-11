class TaskNode {
int taskId;
String taskName;
int priority;
String dueDate;
TaskNode next;
public TaskNode(int taskId, String taskName, int priority,
String dueDate) {
this.taskId = taskId;
this.taskName = taskName;
this.priority = priority;
this.dueDate = dueDate;
this.next = null;
}
}
class TaskScheduler {
private TaskNode head = null;
private TaskNode current = null;
public void addAtBeginning(int id, String name, int
priority, String dueDate) {
TaskNode newNode = new TaskNode(id, name, priority,
dueDate);
if (head == null) {
head = newNode;
head.next = head;
current = head;
} else {
TaskNode temp = head;
while (temp.next != head) temp = temp.next;
newNode.next = head;
temp.next = newNode;
head = newNode;
}
}
public void addAtEnd(int id, String name, int priority,
String dueDate) {
TaskNode newNode = new TaskNode(id, name, priority,
dueDate);
if (head == null) {
head = newNode;
head.next = head;
current = head;
} else {
TaskNode temp = head;
while (temp.next != head) temp = temp.next;
temp.next = newNode;
newNode.next = head;
}
}
public void addAtPosition(int id, String name, int priority,
String dueDate, int pos) {
if (pos <= 1) {
addAtBeginning(id, name, priority, dueDate);
return;
}
TaskNode newNode = new TaskNode(id, name, priority,
dueDate);
TaskNode temp = head;
int count = 1;
while (temp.next != head && count < pos - 1) {
temp = temp.next;
count++;
}
newNode.next = temp.next;
temp.next = newNode;
}
public void removeById(int id) {
if (head == null) return;
TaskNode temp = head, prev = null;
do {
if (temp.taskId == id) {
if (temp == head) {
if (head.next == head) {
head = null;
current = null;
return;
}
TaskNode last = head;
while (last.next != head) last = last.next;
head = head.next;
last.next = head;
if (current == temp) current = head;
} else {
prev.next = temp.next;
if (current == temp) current = prev.next;
}
return;
}
prev = temp;
temp = temp.next;
} while (temp != head);
}
public void viewCurrentTask() {
if (current != null) {
printTask(current);
} else {
System.out.println("No current task.");
}
}
public void moveToNextTask() {
if (current != null) {
current = current.next;
viewCurrentTask();
}
}
public void displayAllTasks() {
if (head == null) {
System.out.println("No tasks available.");
return;
}
TaskNode temp = head;
do {
printTask(temp);
temp = temp.next;
} while (temp != head);
}
public void searchByPriority(int priority) {
if (head == null) {
System.out.println("No tasks available.");
return;
}
TaskNode temp = head;
boolean found = false;
do {
if (temp.priority == priority) {
printTask(temp);
found = true;
}
temp = temp.next;
} while (temp != head);
if (!found) System.out.println("No tasks found with
priority: " + priority);
}
private void printTask(TaskNode task) {
System.out.println("Task ID: " + task.taskId + ", Name:
" + task.taskName +
", Priority: " + task.priority + ", Due Date: "
+ task.dueDate);
}
}
public class TaskSchedulerApp {
public static void main(String[] args) {
TaskScheduler scheduler = new TaskScheduler();
scheduler.addAtEnd(1, "Design System", 2, "2025-04-30");
scheduler.addAtBeginning(2, "Write Report", 1,
"2025-04-27");
scheduler.addAtPosition(3, "Review Code", 3,
"2025-05-01", 2);
System.out.println("All Tasks:");
scheduler.displayAllTasks();
System.out.println("\nCurrent Task:");
scheduler.viewCurrentTask();
System.out.println("\nNext Task:");
scheduler.moveToNextTask();
System.out.println("\nSearch by Priority 2:");
scheduler.searchByPriority(2);
System.out.println("\nRemoving Task ID 3:");
scheduler.removeById(3);
System.out.println("\nAll Tasks After Deletion:");
scheduler.displayAllTasks();
}
}
