import java.util.*;
class User {
String userId;
String name;
int age;
List<String> friendIds;
User next;
public User(String userId, String name, int age) {
this.userId = userId;
this.name = name;
this.age = age;
this.friendIds = new ArrayList<>();
this.next = null;
}
}
class SocialMedia {
private User head = null;
public void addUser(String userId, String name, int age) {
User newUser = new User(userId, name, age);
if (head == null) {
head = newUser;
} else {
User temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newUser;
}
}
private User findUser(String userId) {
User temp = head;
while (temp != null) {
if (temp.userId.equals(userId)) {
return temp;
}
temp = temp.next;
}
return null;
}
public void addFriend(String userId1, String userId2) {
User user1 = findUser(userId1);
User user2 = findUser(userId2);
if (user1 != null && user2 != null &&
!user1.friendIds.contains(userId2)) {
user1.friendIds.add(userId2);
user2.friendIds.add(userId1);
}
}
public void removeFriend(String userId1, String userId2) {
User user1 = findUser(userId1);
User user2 = findUser(userId2);
if (user1 != null && user2 != null) {
user1.friendIds.remove(userId2);
user2.friendIds.remove(userId1);
}
}
public void displayFriends(String userId) {
User user = findUser(userId);
if (user == null) return;
System.out.println(user.name + "'s friends:");
for (String friendId : user.friendIds) {
User friend = findUser(friendId);
if (friend != null) {
System.out.println(friend.name + " (ID: " + friend.userId +
")");
}
}
}
public void findMutualFriends(String userId1, String userId2) {
User user1 = findUser(userId1);
User user2 = findUser(userId2);
if (user1 == null || user2 == null) return;
Set<String> mutual = new HashSet<>(user1.friendIds);
mutual.retainAll(user2.friendIds);
System.out.println("Mutual friends of " + user1.name + " and " +
user2.name + ":");
for (String id : mutual) {
User friend = findUser(id);
if (friend != null) {
System.out.println(friend.name + " (ID: " + friend.userId +
")");
}
}
}
public void searchUserByNameOrId(String keyword) {
User temp = head;
while (temp != null) {
if (temp.name.equalsIgnoreCase(keyword) ||
temp.userId.equalsIgnoreCase(keyword)) {
System.out.println("User found: " + temp.name + " (ID: " +
temp.userId + ", Age: " + temp.age + ")");
return;
}
temp = temp.next;
}
System.out.println("User not found.");
}
public void countFriends() {
User temp = head;
while (temp != null) {
System.out.println(temp.name + " has " + temp.friendIds.size()
+ " friend(s).");
temp = temp.next;
}
}
}
public class SocialMediaNetwork {
public static void main(String[] args) {
SocialMedia sm = new SocialMedia();
sm.addUser("U1", "Alice", 22);
sm.addUser("U2", "Bob", 25);
sm.addUser("U3", "Charlie", 20);
sm.addUser("U4", "Diana", 24);
sm.addFriend("U1", "U2");
sm.addFriend("U1", "U3");
sm.addFriend("U2", "U3");
sm.addFriend("U3", "U4");
sm.displayFriends("U1");
sm.findMutualFriends("U1", "U2");
sm.countFriends();
sm.searchUserByNameOrId("Charlie");
sm.removeFriend("U1", "U2");
sm.displayFriends("U1");
}
}
