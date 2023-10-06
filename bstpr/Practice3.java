package bstpr;// Practice3
// 주어진 BST 에서 두 노드의 합이 target 값이 되는 경우가 있는지 확인하세요.
// 있으면 true, 없으면 false 반환

// 입력 트리: 5, 3, 6, 2, 4, null, 7
// 결과: true

// 입력 트리: 5,3,6,2,4,null,7
// 결과: false

import java.util.ArrayList;

public class Practice3 {
    public static void solution(Integer[] data, int target) {
        BinarySearchTree bt = new BinarySearchTree();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                bt.addNode(data[i]);
            }
        }

        bt.levelOrder(bt.head, list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        Integer[] data = {5, 3, 6, 2, 4, null, 7};
        int target = 9;
        solution(data, target);

        data = new Integer[]{5, 3, 6, 2, 4, null, 7};
        target = 28;
        solution(data, target);
    }
}
