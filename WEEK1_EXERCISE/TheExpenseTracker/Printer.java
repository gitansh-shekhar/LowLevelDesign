package WEEK1_EXERCISE.TheExpenseTracker;

import java.util.Collection;

public class Printer {

    void  Print(Collection<Expense> collection){
        for(Expense e : collection){
            System.out.println(e.toString());
        }
    }
}
