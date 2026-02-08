
class TaskRunner extends Thread {

    TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // RUNNABLE 
            for (int i = 0; i < 1_000_000; i++) {
                int x = i * i;
            }

            // TIMED_WAITING
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }
}
