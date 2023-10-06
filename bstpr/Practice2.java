package bstpr;// Practice2
// 주어진 BST 에서 노드 간의 차이값 중 최소 값을 구하세요.

// 입력 트리: 4, 2, 6, 1, 3
// 출력: 1

// 입력 트리: 5, 1, 48, null, null, 12, 51
// 출력: 3

import java.util.ArrayList;

public class Practice2 {

    public static void solution(Integer[] data) {
        BinarySearchTree bt = new BinarySearchTree();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                bt.addNode(data[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        bt.inOrder(bt.head, list);
        System.out.println(list.get(list.size() - 1) - list.get(list.size() - 2));
    }

    public static void main(String[] args) {
        // Test code
        Integer[] data = {3, 1, 4, null, 2};
        solution(data);

        data = new Integer[]{5, 1, 48, null, null, 12, 51};
        solution(data);
    }
}
