import java.util.*;
public class FileBackupScheduler {

    public static void main(String[] args) {

        PriorityQueue<BackupTask> queue = new PriorityQueue<>();

        try {
            addTask(queue, "/documents", 2);
            addTask(queue, "/system", 5);     // critical
            addTask(queue, "", 3);            // invalid path
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        // Execute backup tasks
        System.out.println("\nExecuting Backups:");
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up folder: " + task.folderPath +
                               " (Priority " + task.priority + ")");
        }
    }

    // Add task method
    static void addTask(PriorityQueue<BackupTask> queue,
                        String path, int priority)
            throws InvalidBackupPathException {

        if (path == null || path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }

        queue.add(new BackupTask(path, priority));
        System.out.println("Backup scheduled for " + path);
    }
}