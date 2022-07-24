package leetCode.n146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class LinkNode{
        int key;
        int val;
        LinkNode next;
        LinkNode prev;
        public LinkNode() {

        }

        public LinkNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    Map<Integer, LinkNode> map = new HashMap<>();
    int size ;
    int capacity;
    LinkNode head;
    LinkNode tail;
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkNode();
        tail = new LinkNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        LinkNode node = map.get(key);
        remove(node);
        addHead(node);
        return node.key;
    }

    public void put(int key, int value) {
        LinkNode node = new LinkNode(key, value);
        map.put(value, node);
        if (size < capacity) {
            addHead(node);
        } else {
            remove(tail.prev);
            addHead(node);
            map.remove(tail.prev.val);
        }
    }

    public void addHead(LinkNode node) {
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }

    public void remove(LinkNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
