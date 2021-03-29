package complete.newcode93;

import java.util.*;

/**
 * 题目描述
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * set(key, value)：将记录(key, value)插入该结构
 * get(key)：返回key对应的value值
 * [要求]
 * set和get方法的时间复杂度为O(1)
 * 某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 * 当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 *
 * 示例1
 * 输入
 * 复制
 * [[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 * 返回值
 * 复制
 * [1,-1]
 * 说明
 * 第一次操作后：最常使用的记录为("1", 1)
 * 第二次操作后：最常使用的记录为("2", 2)，("1", 1)变为最不常用的
 * 第三次操作后：最常使用的记录为("3", 2)，("1", 1)还是最不常用的
 * 第四次操作后：最常用的记录为("1", 1)，("2", 2)变为最不常用的
 * 第五次操作后：大小超过了3，所以移除此时最不常使用的记录("2", 2)，加入记录("4", 4)，
 * 并且为最常使用的记录，然后("3", 2)变为最不常使用的记录
 *
 * 备注:
 * 1≤K≤N≤10^5
 * −2×10^9≤x,y≤2×10^9
 *
*/
public class LRUCache {

    private Map<Integer, Node> lruDb;
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lruDb = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int[] LRU (int[][] operators, int k) {
        List<Integer> list = new ArrayList<>();

        for (int[] operate : operators) {
            if (operate[0] == 1) {
                this.add(operate, k);
            } else {
                int value = this.get(operate[1]);
                list.add(value);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void add(int[] operate, int k) {
        Node node = lruDb.get(operate[1]);
        if (node == null) {
            while (lruDb.size() >= k) {
                Node removeNode = this.removeTail();
                lruDb.remove(removeNode.key);
            }
            node = new Node(operate[1], operate[2]);
            this.addHead(node);
            lruDb.put(operate[1], node);
        } else {
            node.val = operate[2];
            moveToHead(node);
        }
    }

    public int get(int key) {
        Node value = lruDb.get(key);
        if (value == null) {
            return -1;
        }
        this.moveToHead(value);
        return value.val;
    }

    private void moveToHead(Node node) {
        this.remove(node);
        this.addHead(node);
    }

    private void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void addHead(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    private Node removeTail() {
        Node removeNode = this.tail.pre;
        this.remove(removeNode);
        return removeNode;
    }

    static class Node {
        int key;
        int val;
        Node pre;
        Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public Node(int val, Node pre, Node next) {
            this.val = val;
            this.pre = pre;
            this.next = next;
        }
    }

}
