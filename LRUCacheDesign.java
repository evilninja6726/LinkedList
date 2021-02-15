package linkedListDs;

import java.util.HashMap;

public class LRUCacheDesign {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 10);
        cache.get(2);
        cache.get(1);
        cache.set(2, 20);
        cache.get(2);
        cache.set(3, 30);
        cache.get(1);
        cache.get(2);
        cache.get(3);
        cache.set(4, 40);
        cache.get(2);
        cache.get(3);
        cache.set(5, 50);
        cache.get(4);
    }
}

class LRUNode {
    int key, value;
    LRUNode next, prev;

    LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private int capacity, count;
    private HashMap<Integer, LRUNode> hashMap;
    private LRUNode head, tail;

    LRUCache(int capacity) {
        this.capacity = capacity;
        hashMap = new HashMap<>();
        head = new LRUNode(0, 0);
        tail = new LRUNode(0, 0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
    }

    public void deleteNode(LRUNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addNodeToHead(LRUNode node) {
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }

    public int get(int key) {
        if (hashMap.get(key) != null) {
            LRUNode node = hashMap.get(key);
            int keyValue = node.value;
            deleteNode(node);
            addNodeToHead(node);
            System.out.println("The Value for " + key + " is " + keyValue);
            return keyValue;
        }
        System.out.println("The value for " + key + " is not Present");
        return -1;
    }

    public void set(int key, int value) {
        System.out.println("Setting the " + value + " for the " + key);
        if (hashMap.get(key) != null) {
            LRUNode node = hashMap.get(key);
            node.value = value;
            deleteNode(node);
            addNodeToHead(node);
        } else {
            LRUNode node = new LRUNode(key, value);
            hashMap.put(key, node);
            if (count < capacity) {
                addNodeToHead(node);
                count++;
            } else {
                hashMap.remove(tail.prev.key);
                deleteNode(tail.prev);
                addNodeToHead(node);
            }
        }
    }
}
