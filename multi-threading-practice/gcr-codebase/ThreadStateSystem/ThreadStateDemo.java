public class ThreadStateDemo {

    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        Thread[] tasks = {t1, t2};

        StateMonitor monitor = new StateMonitor(tasks);

        // NEW state
        monitor.start();

        t1.start();
        t2.start();
    }
}
