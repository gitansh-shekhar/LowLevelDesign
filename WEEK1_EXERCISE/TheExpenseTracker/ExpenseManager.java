package WEEK1_EXERCISE.TheExpenseTracker;

public class ExpenseManager {
      StorageType sr ;
      ExpenseManager(StorageType sr){
          this.sr = sr;
      }
      void addExpense(Expense e){
          sr.save(e);
      }
      int  TotalExpense(){
         int sum =0;
         for(Expense e : sr.getExpenses()){
             sum+=e.amount;
         }
         return sum;
      }
}
