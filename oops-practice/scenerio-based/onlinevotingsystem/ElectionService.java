package onlinevotingsystem;

public interface ElectionService {
    void castVote(Vote vote) throws DuplicateVoteException;
}
