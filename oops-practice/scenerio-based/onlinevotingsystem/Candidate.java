package onlinevotingsystem;

public class Candidate {
    String candidateId;
    String name;
    int votes;

    public Candidate(String candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
        this.votes = 0;
    }

    public void addVote() {
        votes++;
    }
}
