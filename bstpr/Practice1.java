package bstpr;// Practice1
// 주어진 이진 탐색 트리에서 N 번째로 작은 수 구하기

// 입력 트리: 3, 1, 4, null, 2
// N: 1
// 결과: 1

// 입력 트리: 5, 3, 6, 2, 4, null, null, 1
// N: 3
// 결과: 3

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    Node head;

    BinarySearchTree() {
    }

    BinarySearchTree(int key) {
        this.head = new Node(key, null, null);
    }

    public void addNode(int key) {
        this.head = this.addNode(this.head, key);
    }

    public Node addNode(Node cur, int key) {
        if (cur == null) {
            return new Node(key, null, null);
        }

        if (key < cur.key) {
            cur.left = addNode(cur.left, key);
        } else {
            cur.right = addNode(cur.right, key);
        }

        return cur;
    }

    public void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        this.inOrder(node.left, list);
        list.add(node.key);
        this.inOrder(node.right, list);
    }

    public void levelOrder(Node node, ArrayList<Integer> list) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            list.add(cur.key);

            if (cur.left != null) {
                queue.add(cur.left);
            }

            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

}

public class Practice1 {
    public static void solution(Integer[] data, int n) {
        BinarySearchTree bt = new BinarySearchTree();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                bt.addNode(data[i]);
            }
        }

        bt.inOrder(bt.head, list);
        System.out.println(list.get(n - 1));
    }

    public static void main(String[] args) {
        // Test code
        Integer[] data = {3, 1, 4, null, 2};
        int n = 1;
        solution(data, n);

        data = new Integer[]{5, 3, 6, 2, 4, null, null, 1};
        n = 3;
        solution(data, n);
    }
}
