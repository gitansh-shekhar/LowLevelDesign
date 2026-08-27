package day02_Genrics_Practice;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.Queue;

public class  GenricsCache <K , V> {
    private  int capacity;
    private Map<K , V> map;
    private Queue<K> queue ;
    public GenricsCache(int capacity){
        this.capacity= capacity;
        map = new HashMap<>();
        queue = new ArrayDeque<>();
    }
    public void add(K key , V value){
        if(map.containsKey(key)){
            System.out.println("Data is cached already.");
        }
        else {
            if(map.size()==capacity){
                K lastData = queue.poll();
                map.remove( lastData );
            }
            map.put(key , value);
            queue.offer(key);
            System.out.println("Data Inserted Successfully");
        }
    }
    public void  getValue(K key){
        if( map.containsKey(key) ){
            System.out.println("The Corresponding to "+key+" is "+map.get(key));
        }
        else {
            System.out.println("Value does not exits in the cache");
        }
    }
}
