package WEEK1_EXERCISE.TheExpenseTracker;

public class Expense {
    public String description;
    public int amount;
    public Category category ;
    public  Expense(String description , int amount , Category category){
        this.description = description ;
        this.amount = amount;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", category=" + category +
                '}';
    }
}
