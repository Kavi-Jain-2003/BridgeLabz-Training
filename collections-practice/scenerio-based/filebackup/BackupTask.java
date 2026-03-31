// BackupTask class
public class BackupTask implements Comparable<BackupTask> {

    String folderPath;
    int priority;   // Higher number = higher priority

    BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    // Compare tasks by priority
    public int compareTo(BackupTask other) {
        return other.priority - this.priority; // high priority first
    }
}