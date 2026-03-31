//singly linked list:friend node class
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
//usernode class
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}

public class SocialMediaConnections {

    UserNode head = null;

    // Add User
    void addUser(int userId, String name, int age) {
        UserNode user = new UserNode(userId, name, age);

        if (head == null) {
            head = user;
            return;
        }

        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = user;
    }

    // Find user by ID
    UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by name
    void searchUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.userId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Add friend connection (bidirectional)
    void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(u1, id2);
        addFriendToList(u2, id1);
        System.out.println("Friend connection added");
    }

    void addFriendToList(UserNode user, int friendId) {
        FriendNode f = new FriendNode(friendId);
        f.next = user.friendHead;
        user.friendHead = f;
    }

    // Remove friend connection
    void removeFriend(int id1, int id2) {
        removeFriendFromList(findUserById(id1), id2);
        removeFriendFromList(findUserById(id2), id1);
        System.out.println("Friend connection removed");
    }
//remove friend from list
    void removeFriendFromList(UserNode user, int friendId) {
        if (user == null || user.friendHead == null)
            return;

        if (user.friendHead.friendId == friendId) {
            user.friendHead = user.friendHead.next;
            return;
        }

        FriendNode temp = user.friendHead;
        while (temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all friends of a user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count friends
    void countFriends(int userId) {
        UserNode user = findUserById(userId);
        int count = 0;
        FriendNode temp = user.friendHead;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total friends: " + count);
    }

    // Find mutual friends
    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SocialMediaConnections sm = new SocialMediaConnections();

        sm.addUser(1, "Siya", 22);
        sm.addUser(2, "Riya", 21);
        sm.addUser(3, "Aman", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.countFriends(1);

        sm.mutualFriends(1, 2);
        sm.searchUserByName("Riya");

        sm.removeFriend(1, 2);
        sm.displayFriends(1);
    }
}
