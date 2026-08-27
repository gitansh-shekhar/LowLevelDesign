package WEEK1_EXERCISE.TheExpenseTracker;

import java.util.Collection;
public interface StorageType {
    void save(Expense e);
    Collection<Expense> getExpenses();
}
