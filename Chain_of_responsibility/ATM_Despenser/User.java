package Chain_of_responsibility.ATM_Despenser;

public class User {
    public static void main(String[] args) {
        BillHandler thousand = new BillHandler(1000 , 4);
        BillHandler Five_hundred  = new BillHandler(500 , 2);
        BillHandler hundred  = new BillHandler(100 , 2);
        thousand.nextHandler = Five_hundred;
        Five_hundred.nextHandler = hundred;
        hundred.nextHandler = null;
        thousand.handleRequest(4532);
    }
}
