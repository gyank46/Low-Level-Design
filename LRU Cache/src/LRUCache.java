import java.util.HashMap;

public class LRUCache {
    public int capacity;
    public DLL head;
    public DLL tail;

    public HashMap<Integer,DLL> cacheMap = new HashMap<>();


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DLL(-1,-1);
        this.tail = new DLL(-1,-1);
        this.tail.prev = head;
        this.head.next = tail;
    }

    public int get(int key) {
        if(cacheMap.containsKey(key)){
            DLL node = this.cacheMap.get(key);
            remove(node);
            add(node);

            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cacheMap.containsKey(key)){
            DLL node = this.cacheMap.get(key);
            node.value = value;

            remove(node);

            add(node);

            return;
        }
        if(cacheMap.size()>=this.capacity){
            DLL node = this.tail.prev;

            remove(node);

            int keyToDelete = node.key;
            cacheMap.remove(keyToDelete);
        }
        DLL newNode = new DLL(key,value);

        add(newNode);


        this.cacheMap.put(key,newNode);
    }

    void add(DLL node){
        DLL currHead = this.head.next;
        node.next = currHead;
        node.prev = this.head;
        currHead.prev = node;
        this.head.next = node;
    }

    void remove(DLL node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
