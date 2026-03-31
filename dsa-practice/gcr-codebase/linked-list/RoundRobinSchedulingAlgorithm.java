//Circular Linked list :processnode class
class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
public class RoundRobinSchedulingAlgorithm{

    ProcessNode head = null;
    ProcessNode tail = null;

    // Add process at end
    void addProcess(int pid, int burstTime, int priority) {
        ProcessNode pnode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = pnode;
            pnode.next = head;
            return;
        }

        tail.next = pnode;
        pnode.next = head;
        tail = pnode;
    }

    // Remove process by PID
    void removeProcess(int pid) {
        if (head == null) return;

        // Single node
        if (head.pid == pid && head == tail) {
            head = tail = null;
            return;
        }

        // Remove head
        if (head.pid == pid) {
            head = head.next;
            tail.next = head;
            return;
        }

        ProcessNode temp = head;
        do {
            if (temp.next.pid == pid) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Display processes
    void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid +
                    " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin Scheduling
    void roundRobin(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int completed = 0;
        int totalProcesses = countProcesses();

        ProcessNode current = head;

        while (completed < totalProcesses) {

            if (current.remainingTime > 0) {
                System.out.println("\nExecuting Process " + current.pid);

                if (current.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    current.remainingTime -= timeQuantum;
                } else {
                    time += current.remainingTime;
                    current.remainingTime = 0;
                    current.turnaroundTime = time;
                    current.waitingTime =
                            current.turnaroundTime - current.burstTime;
                    completed++;
                }
            }

            displayQueue();
            current = current.next;
        }

        calculateAverageTimes();
    }
//counting processes
    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
//calculating average time
    void calculateAverageTimes() {
        double totalWT = 0, totalTAT = 0;
        ProcessNode temp = head;

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);

        int n = countProcesses();
        System.out.println("\nAverage Waiting Time: " + (totalWT / n));
        System.out.println("Average Turnaround Time: " + (totalTAT / n));
    }

    public static void main(String[] args) {

        RoundRobinSchedulingAlgorithm rr = new RoundRobinSchedulingAlgorithm();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        int timeQuantum = 3;
        rr.roundRobin(timeQuantum);
    }
}
