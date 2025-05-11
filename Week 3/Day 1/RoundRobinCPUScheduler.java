class Process {
String processId;
int burstTime;
int priority;
int remainingTime;
int waitingTime = 0;
int turnaroundTime = 0;
Process next;
public Process(String processId, int burstTime, int priority) {
this.processId = processId;
this.burstTime = burstTime;
this.remainingTime = burstTime;
this.priority = priority;
this.next = null;
}
}
class RoundRobinScheduler {
private Process head = null;
private Process tail = null;
private int processCount = 0;
public void addProcess(String processId, int burstTime, int priority) {
Process newProcess = new Process(processId, burstTime, priority);
if (head == null) {
head = tail = newProcess;
newProcess.next = head;
} else {
tail.next = newProcess;
newProcess.next = head;
tail = newProcess;
}
processCount++;
}
public void removeProcess(Process prev, Process current) {
if (current == head && current == tail) {
head = tail = null;
} else if (current == head) {
tail.next = head.next;
head = head.next;
} else if (current == tail) {
prev.next = head;
tail = prev;
} else {
prev.next = current.next;
}
processCount--;
}
public void simulate(int timeQuantum) {
int time = 0;
Process current = head;
Process prev = tail;
System.out.println("Round Robin Scheduling Simulation:");
while (processCount > 0) {
if (current.remainingTime > 0) {
System.out.println("Executing: " + current.processId);
int execTime = Math.min(current.remainingTime,
timeQuantum);
current.remainingTime -= execTime;
time += execTime;
Process temp = head;
do {
if (temp != current && temp.remainingTime > 0)
temp.waitingTime += execTime;
temp = temp.next;
} while (temp != head);
if (current.remainingTime == 0) {
current.turnaroundTime = time;
System.out.println("Completed: " + current.processId);
removeProcess(prev, current);
current = prev.next;
} else {
prev = current;
current = current.next;
}
displayProcesses();
} else {
prev = current;
current = current.next;
}
}
calculateAverageTimes();
}
public void displayProcesses() {
if (head == null) {
System.out.println("No processes in queue.");
return;
}
Process temp = head;
System.out.println("Current Process Queue:");
do {
System.out.println("Process ID: " + temp.processId + ",
Remaining Time: " + temp.remainingTime);
temp = temp.next;
} while (temp != head);
System.out.println();
}
public void calculateAverageTimes() {
int totalWT = 0, totalTAT = 0;
Process temp = head;
if (temp == null) {
System.out.println("All processes completed.");
return;
}
do {
totalWT += temp.waitingTime;
totalTAT += temp.turnaroundTime;
temp = temp.next;
} while (temp != head);
double avgWT = (double) totalWT / processCount;
double avgTAT = (double) totalTAT / processCount;
System.out.println("Average Waiting Time: " + avgWT);
System.out.println("Average Turnaround Time: " + avgTAT);
}
}
public class RoundRobinCPUScheduler {
public static void main(String[] args) {
RoundRobinScheduler scheduler = new RoundRobinScheduler();
scheduler.addProcess("P1", 10, 1);
scheduler.addProcess("P2", 4, 2);
scheduler.addProcess("P3", 5, 1);
scheduler.addProcess("P4", 7, 3);
int timeQuantum = 3;
scheduler.simulate(timeQuantum);
}
}
