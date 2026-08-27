package day3_concurrentHashMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer , String > map = new ConcurrentHashMap<>();
        Thread t1 = new Thread(()->{
            for(int i=0 ; i<1000; i++){
                map.put(i , "Thread1");
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1000 ; i<2000; i++){
                map.put(i , "Thread2");
            }
        });
        Thread t3 = new Thread(()->{
            for(int i=2000 ; i<3000; i++){
                map.put(i , "Thread3");
            }
        });
        Thread t4 = new Thread(()->{
            for(int i=3000 ; i<4000; i++){
                map.put(i , "Thread4");
            }
        });
        Thread t5 = new Thread(()->{
            for(int i=4000 ; i<5000; i++){
                map.put(i , "Thread5");
            }
        });
        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();
        System.out.println(map.size());

    }
}
