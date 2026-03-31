import java.util.*;

public class AuctionItem {

    private String itemName;

    // Highest bid first
    private TreeMap<Double, User> bids =
            new TreeMap<>(Collections.reverseOrder());

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    // Place bid
    public void placeBid(User user, Bid bid)
            throws InvalidBidException {

        if (!bids.isEmpty()) {
            double highestBid = bids.firstKey();

            if (bid.getAmount() <= highestBid) {
                throw new InvalidBidException(
                    "Bid must be higher than current highest bid: " + highestBid
                );
            }
        }

        bids.put(bid.getAmount(), user);
        System.out.println("Bid placed: " + bid.getAmount() +
                " by " + user.getName());
    }

    // Show highest bid
    public void showHighestBid() {
        if (bids.isEmpty()) {
            System.out.println("No bids yet");
            return;
        }

        Map.Entry<Double, User> entry = bids.firstEntry();
        System.out.println(
            "Highest Bid: " + entry.getKey() +
            " by " + entry.getValue().getName()
        );
    }
}
