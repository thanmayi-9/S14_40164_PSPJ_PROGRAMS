public class TierFee {

    static String assigntier(char size, double weight) {
        if (size == 'S' && weight <= 1.0)
            return "SMALL";

        if (size == 'M' || weight <= 5.0)
            return "Medium";

        return "Large";
    }

    static double computefee(String tier) {
        switch (tier) {
            case "Medium":
                return 35.0;

            case "Large":
                return 50.0;

            default:
                return 20.0;
        }
    }

    static void printreceipt(String tier, double fee) {
        System.out.println("Tier: " + tier);
        System.out.printf(
            "Fee: %.2f\n", fee);
    }

    public static void main(String[] args) {
        String tier = assigntier('L', 3.2);
        printreceipt(tier, computefee(tier));
    }
}