import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    StateMonitor(Thread[] threads) {
        this.threads = threads;
        setName("Monitor");
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                String key = t.getName() + "-" + state;

                stateCount.put(key, stateCount.getOrDefault(key, 0) + 1);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted");
            }
        }

        // Summary
        System.out.println("\n--- Summary ---");
        for (Thread t : threads) {
            long count = stateCount.keySet()
                    .stream()
                    .filter(k -> k.startsWith(t.getName()))
                    .count();

            System.out.println("Summary: " + t.getName() +
                    " went through " + count + " states");
        }
    }
}
