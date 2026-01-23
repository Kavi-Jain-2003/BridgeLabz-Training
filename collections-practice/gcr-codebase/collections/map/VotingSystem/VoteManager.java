import java.util.*;

public class VoteManager {

    // HashMap for fast vote counting
    HashMap<String, Integer> voteMap = new HashMap<>();

    // LinkedHashMap to maintain insertion order
    LinkedHashMap<String, Integer> linkedVoteMap = new LinkedHashMap<>();

    // TreeMap for sorted results (alphabetically)
    TreeMap<String, Integer> treeVoteMap = new TreeMap<>();

    // Cast a vote
    public void castVote(String candidate) {

        // Update HashMap
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap
        linkedVoteMap.put(candidate, linkedVoteMap.getOrDefault(candidate, 0) + 1);

        // Update TreeMap
        treeVoteMap.put(candidate, treeVoteMap.getOrDefault(candidate, 0) + 1);
    }

    // Display results from HashMap
    public void displayHashMapResults() {
        System.out.println("Results (HashMap - unordered):");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    // Display results from LinkedHashMap
    public void displayLinkedHashMapResults() {
        System.out.println("Results (LinkedHashMap - insertion order):");
        for (Map.Entry<String, Integer> entry : linkedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    // Display results from TreeMap
    public void displayTreeMapResults() {
        System.out.println("Results (TreeMap - sorted alphabetically):");
        for (Map.Entry<String, Integer> entry : treeVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    // Find candidate with highest votes
    public void winner() {
        String topCandidate = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                topCandidate = entry.getKey();
            }
        }

        System.out.println("Winner: " + topCandidate + " with " + maxVotes + " votes");
    }
    public static void main(String[] args) {

        VoteManager manager = new VoteManager();

        // Casting votes
        manager.castVote("Alice");
        manager.castVote("Bob");
        manager.castVote("Alice");
        manager.castVote("Charlie");
        manager.castVote("Bob");
        manager.castVote("Alice");

        // Display results
        manager.displayHashMapResults();
        manager.displayLinkedHashMapResults();
        manager.displayTreeMapResults();

        // Display winner
        manager.winner();
    }
}

