package practice;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
 
public class LRUCache < K, V > extends LinkedHashMap < K, V > {
 
    private int capacity; // Maximum number of items in the cache.
     
    public LRUCache(int capacity) { 
        super(capacity, 1.0f, true); // Pass 'true' for accessOrder.
        this.capacity = capacity;
    }
     
    protected boolean removeEldestEntry(Entry entry) {
        return (size() > this.capacity);
    } 
    
    public static void main(String[] args) {
		LRUCache<Integer, String> lru = new LRUCache<Integer, String>(3);
		lru.put(1, "a");
		lru.put(2, "b");
		lru.put(3, "c");
		lru.put(4, "d");
		lru.put(5, "e");
		lru.put(6, "f");
		System.out.println(lru);
		System.out.println(lru.get(1));
		
		
	}
}