package SingletonPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {

            AppConfig app = AppConfig.getInstance();

            System.out.println(
                    Thread.currentThread().getName() +
                            " : " +
                            System.identityHashCode(app)
            );

            app.setConfig("app.env","PRODUCTION");

        });
        Thread t2 = new Thread(() -> {

            AppConfig app = AppConfig.getInstance();

            System.out.println(
                    Thread.currentThread().getName() +
                            " : " +
                            System.identityHashCode(app)
            );

            app.setConfig("app.env","PRODUCTION");

        });;
        t2.start();t1.start();
        t1.join();t2.join();
    }
}
