public class AuctionApp {

    public static void main(String[] args) {

        AuctionItem item = new AuctionItem("iPhone 15");

        User u1 = new User("U1", "Amit");
        User u2 = new User("U2", "Neha");

        try {
            item.placeBid(u1, new Bid(50000));
            item.placeBid(u2, new Bid(55000));
            item.placeBid(u1, new Bid(52000)); // Invalid
        } catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        item.showHighestBid();
    }
}
