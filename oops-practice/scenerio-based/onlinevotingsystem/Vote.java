package onlinevotingsystem;

public class Vote {
    String voterId;
    String candidateId;

    public Vote(String voterId, String candidateId) {
        this.voterId = voterId;
        this.candidateId = candidateId;
    }
}
