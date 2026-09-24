import java.util.Scanner; // Required for reading keyboard inputs

public class VendingMachine {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. DATA BASICS (Variables, Identifiers, Literals, Constants)
        // ==========================================
        String studentName = "Akki";           // String identifier holding text literal
        int stockCount = 15;                   // int primitive data type
        double itemPrice = 45.50;              // double data type for precise money values
        boolean isHappyHour = true;            // boolean flag for condition checks
        
        // A Constant: declared using 'final'. This value CANNOT change during execution.
        final double CGST_TAX = 0.05; 
        System.out.println("GST ="+CGST_TAX);

        System.out.println("--- Welcome to the Smart Vending Grid ---");

        // ==========================================
        // 2. EXPRESSIONS, PRECEDENCE, & OPERATORS
        // ==========================================
        
        // A. Arithmetic Operators & Precedence
        // Precedence rule: Multiplication (*) happens before Addition (+)
        // Step 1: 2 * itemPrice (2 * 45.50 = 91.0)
        // Step 2: 91.0 + 10.0 (Service charge) = 101.0
        double rawBill = 2 * itemPrice + 10.0;

        // B. Ternary Operator (? :)
        // Shortcut inline replacement for an if-else block
        // Syntax: (Condition) ? value_if_true : value_if_false;
        double discount = (isHappyHour == true) ? 10.0 : 0.0;
        
        // Final bill calculation after deduction
        double netBill = rawBill - discount;

        // C. Relational & Short-Circuit Logical Operators (&&)
        // Rule: If the first condition is false, '&&' short-circuits and skips the second part completely!
        int studentAge = 19;
        double cashInserted = 150.00;
        boolean canDispense = (studentAge >= 18) && (cashInserted >= netBill);

        // D. Unary Operator (Decrement)
        // If the sale is successful, reduce stock count by exactly 1 inline
        if (canDispense) {
            stockCount--; // Decrement: stockCount changes from 15 to 14
        }

        // E. Bitwise Operator (&)
        // Low-level hardware diagnostic check using binary logic masks
        byte sensorByte = 0b00000100;     // Hardware sensor reports binary 4
        byte jamFilterMask = 0b00000100; // Filter tracking the 3rd bit (drop-door engine)
        // Bitwise AND operation compares individual matching bit columns
        boolean isDoorJammed = (sensorByte & jamFilterMask) != 0;

        // ==========================================
        // 3. TYPECASTING (Converting Data Types)
        // ==========================================
        
        // A. Implicit Widening (Automatic)
        // Java converts 'stockCount' (int) into a double automatically to execute this division smoothly.
        double capacityPercentage = stockCount / 20.0; 
        System.out.println("Capacity = "+capacityPercentage);

        // B. Explicit Narrowing (Forced Conversion)
        // The coin mechanism drops physical 1-rupee coins. It cannot drop 4.75 coins.
        // We forcefully place a 'double' into an 'int' variable using the (int) syntax modifier.
        double rawChangeDue = cashInserted - netBill; // 150.0 - 91.0 = 59.0
        int coinsDispensed = (int) rawChangeDue;     // Drops fractional cents completely (truncation)

        // ==========================================
        // 4. CONSOLE I/O (Formatted Printing)
        // ==========================================
        
        // System.out.printf allows formatting layouts. 
        // '%s' outputs strings, '%d' outputs integers, and '%.2f' locks decimals to exactly 2 places.
        System.out.printf("User Authenticated  : %s\n", studentName);
        System.out.printf("Base Snack Price    : ₹%.2f\n", itemPrice);
        System.out.printf("Calculated Net Bill : ₹%.2f\n", netBill);
        System.out.printf("Change Returned     : %d physical coins\n", coinsDispensed);
        System.out.printf("Remaining Stock     : %d units remaining\n", stockCount);
        System.out.printf("Hardware Log Status : Door Jammed = %b\n", isDoorJammed);
        System.out.println("-----------------------------------------\n");

        // ==========================================
        // 5. READING TYPED INPUT & THE SCANNER BUFFER QUIRK
        // ==========================================
        System.out.println("--- Starting Interactive Kiosk Simulation ---");
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your numeric selection row (e.g., 102): ");
        int itemRow = inputScanner.nextInt(); // Reads numeric characters only

        // ⚠️ THE CRITICAL BUFFER QUIRK FIXED HERE:
        // Tapping 'Enter' sends a hidden '\n' character. nextInt() leaves it in the stream buffer.
        // If we don't clean it out, the upcoming nextLine() will absorb it and immediately skip!
        inputScanner.nextLine(); // CLEARING THE BUFFER LINE

        System.out.print("Enter your structural feedback review: ");
        String feedback = inputScanner.nextLine(); // Safely prompts and waits for input now!

        System.out.println("\n[Kiosk Confirmed] Selected Row: " + itemRow + " | Feedback Received: " + feedback);
        
        inputScanner.close(); // Clean resource house-keeping
       
    }
}
