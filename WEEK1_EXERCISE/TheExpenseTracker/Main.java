package WEEK1_EXERCISE.TheExpenseTracker;

public class Main {
    public static void main(String[] args) {
        StorageType inMemory = new ThreadsafeStorage();
        ExpenseManager EM = new ExpenseManager(inMemory);
        EM.addExpense(new Expense("Pizza" , 100 , Category.FOOD));
        EM.addExpense(new Expense("Nainital Trip" , 5000 , Category.TRAVEL));
        EM.addExpense(new Expense("Electricity Bill" , 2000 , Category.BILLS));
        System.out.println(EM.TotalExpense());
        new Printer().Print(inMemory.getExpenses());

    }
}
