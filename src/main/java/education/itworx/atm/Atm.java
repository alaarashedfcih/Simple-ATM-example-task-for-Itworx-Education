package education.itworx.atm;

public class Atm {
    // Constants for card types
    private static final String MASTER_CARD = "Master";
    private static final String PREMIUM_CARD = "Premium";
    private static final String YOUTH_CARD = "Youth";

    public static String processTransaction(Card card) {
        if (card.getType().equals(MASTER_CARD)) {
            return "Accept Transaction";
        } else if (card.getType().equals(PREMIUM_CARD) || card.getType().equals(YOUTH_CARD)) {
            return "Decline Transaction";
        } else {
            return "Error: Invalid Card Type";
        }
    }

    public static void main(String[] args) {
        // Example usage
        Card masterCard = new Card("Master");
        Card premiumCard = new Card("Premium");
        Card unknownCard = new Card("Unknown");

        System.out.println(processTransaction(masterCard)); // Output: Accept Transaction
        System.out.println(processTransaction(premiumCard)); // Output: Decline Transaction
        System.out.println(processTransaction(unknownCard)); // Output: Error: Invalid Card Type
    }
}

