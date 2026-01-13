package onlinevotingsystem;

public class OnlineVotingSystem implements ElectionService {

    Voter[] voters = new Voter[5];
    Candidate[] candidates = new Candidate[5];
    Vote[] votes = new Vote[10];
    int voterCount = 0;
    int candidateCount = 0;
    int voteCount = 0;

    // Register voter
    public void registerVoter(Voter v) {
        if (voterCount < voters.length) {
            voters[voterCount++] = v;
            System.out.println("Voter registered: " + v.name);
        }
    }

    // Register candidate
    public void registerCandidate(Candidate c) {
        if (candidateCount < candidates.length) {
            candidates[candidateCount++] = c;
            System.out.println("Candidate registered: " + c.name);
        }
    }

    // Cast vote
    @Override
    public void castVote(Vote v) throws DuplicateVoteException {
        // Check duplicate vote
        for (int i = 0; i < voteCount; i++) {
            if (votes[i].voterId.equals(v.voterId)) {
                throw new DuplicateVoteException("Voter " + v.voterId + " has already voted!");
            }
        }

        // Add vote
        votes[voteCount++] = v;

        // Update candidate vote count
        for (int i = 0; i < candidateCount; i++) {
            if (candidates[i].candidateId.equals(v.candidateId)) {
                candidates[i].addVote();
                System.out.println("Vote cast for: " + candidates[i].name + " by voter " + v.voterId);
            }
        }
    }

    // Show results
    public void showResults() {
        System.out.println("\nElection Results:");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(candidates[i].name + ": " + candidates[i].votes + " votes");
        }
    }

    // MAIN method
    public static void main(String[] args) {
        OnlineVotingSystem election = new OnlineVotingSystem();

        // Register voters
        Voter v1 = new Voter("V101", "Rahul");
        Voter v2 = new Voter("V102", "Anita");
        election.registerVoter(v1);
        election.registerVoter(v2);

        // Register candidates
        Candidate c1 = new Candidate("C101", "Alice");
        Candidate c2 = new Candidate("C102", "Bob");
        election.registerCandidate(c1);
        election.registerCandidate(c2);

        // Cast votes
        try {
            election.castVote(new Vote("V101", "C101")); // Rahul votes Alice
            election.castVote(new Vote("V102", "C102")); // Anita votes Bob
            // Duplicate vote test
            election.castVote(new Vote("V101", "C102")); // Rahul tries to vote again
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        // Show results
        election.showResults();
    }
}
