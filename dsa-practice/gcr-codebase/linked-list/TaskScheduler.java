//class node
class TaskNode {
    int taskId;
    String taskName;
    String dueDate;
    String priority;
    TaskNode next;

    TaskNode(int taskId, String taskName, String dueDate, String priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.priority = priority;
        this.next = null;
    }
}

public class TaskScheduler {
    TaskNode head = null;
    TaskNode tail = null;
    TaskNode current = null;

    // adding Task AT end
    void addTaskAtEnd(int taskId, String taskName, String dueDate, String priority) {

        TaskNode tnode = new TaskNode(taskId, taskName, dueDate, priority);
        if (head == null) {
            head = tail = tnode;
            tnode.next = head; //circular connection
            current = head;
            System.out.println("Task inserted successfully");
            return;
        }
        tail.next = tnode;
        tnode.next = head;
        tail = tnode;
    }

    // adding Task AT beginning
    void addTaskAtBeginning(int taskId, String taskName, String dueDate, String priority) {
        TaskNode tnode = new TaskNode(taskId, taskName, dueDate, priority);
        if (head == null) {
            head = tail = tnode;
            tnode.next = head;
            current = head;
            return;
        }
        tnode.next = head;
        tail.next = tnode;
        head = tnode;

        System.out.println("Task inserted successfully");
    }

    // adding Task at specific position
    void addTaskAtSpecificPosition(int taskId, String taskName, String dueDate, String priority, int position) {
        TaskNode tnode = new TaskNode(taskId, taskName, dueDate, priority);
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, dueDate, priority);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        tnode.next = temp.next;
        temp.next = tnode;

        if (temp == tail) {
            tail = tnode;
        }
    }

    // remove task by ID
    void removeTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        // Single node
        if (head.taskId == taskId && head == tail) {
            head = tail = current = null;
            System.out.println("task removed");
            return;
        }

        // Remove head
        if (head.taskId == taskId) {
            head = head.next;
            tail.next = head;
            System.out.println("task removed");
            return;
        }
        TaskNode temp = head;
        do {
            if (temp.next.taskId == taskId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                System.out.println("task removed");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View Current Task & Move to Next
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No task available");
            return;
        }

        System.out.println(
                current.taskId + " | " + current.taskName + " | " +
                        current.priority + " | " + current.dueDate);

        current = current.next;
    }

    // displaying Tasks
    void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(
                    temp.taskId + " | " + temp.taskName + " | " +
                            temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    void searchByPriority(String priority) {
        if (head == null)
            return;

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority.equals(priority)) {
                System.out.println("Task Found: " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task found with this priority");
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addTaskAtEnd(1, "Coding", "10-02-2026", "High");
        ts.addTaskAtEnd(2, "Testing", "12-02-2026", "Low");
        ts.addTaskAtBeginning(3, "Design", "08-02-2026", "High");

        ts.displayAllTasks();

        System.out.println("\nCurrent Task:");
        ts.viewCurrentTask();
        ts.viewCurrentTask();

        ts.searchByPriority("High");

        ts.removeTask(2);
        System.out.println("\nAfter Removal:");
        ts.displayAllTasks();

    }

}
