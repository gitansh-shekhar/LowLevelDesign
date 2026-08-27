package SingletonPattern;
import java.util.concurrent.ConcurrentHashMap;

public class AppConfig {
    private static AppConfig singletonInstance ;
    private ConcurrentHashMap<String , String> appCofigMap;
    private AppConfig(){
        appCofigMap = new ConcurrentHashMap<>();
    }
    public static AppConfig getInstance(){
        if(singletonInstance == null){
            synchronized (AppConfig.class){
               if(singletonInstance==null){
                   singletonInstance = new AppConfig();
               }
            }
        }
        return singletonInstance;
    }
    public void setConfig(String key, String value) {

        String old = appCofigMap.putIfAbsent(key, value);

        if(old != null){
            System.out.println(key + " already exists.");
        }

    }
    public String getConfig(String key){
       return appCofigMap.get(key);
    }

}
