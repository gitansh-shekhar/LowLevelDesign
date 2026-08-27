package WEEK1_EXERCISE.TheExpenseTracker;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsafeStorage implements StorageType {
    private ConcurrentHashMap <Integer , Expense > storage = new ConcurrentHashMap<>();
    private AtomicInteger idGenerator= new AtomicInteger(1);
    @Override
    public void save(Expense e){
        int nextId = idGenerator.getAndIncrement();
        storage.put(nextId ,e );
    }
    @Override
    public Collection<Expense> getExpenses() {
        return storage.values();
    }
}
