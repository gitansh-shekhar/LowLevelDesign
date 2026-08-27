package Chain_of_responsibility.ATM_Despenser;

public class BillHandler extends Handler {
    private final int denomination;
    private int stock;

    public BillHandler(int denomination, int stock) {
        this.denomination = denomination;
        this.stock = stock;
    }

    @Override
    public void handleRequest(int amount) {
        int notesNeeded = amount / denomination;
        int fulfilled = Math.min(notesNeeded, stock);

        if (fulfilled > 0) {
            System.out.println(fulfilled + " * " + denomination + " = " + (fulfilled * denomination) + " is being debited.");
            amount -= (fulfilled * denomination);
            stock -= fulfilled; // Decrement stock after dispensing
        }

        if (amount > 0) {
            if (nextHandler != null) {
                nextHandler.handleRequest(amount);
            } else {
                System.out.println("Error: Remaining amount " + amount + " cannot be fulfilled.");
            }
        }
    }
}