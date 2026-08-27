package Chain_of_responsibility.ATM_Despenser;

public abstract class  Handler {
    protected   Handler nextHandler;

    public  void SetHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int amount);
}
