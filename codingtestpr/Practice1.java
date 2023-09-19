package codingtestpr;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] answer = solution(15);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
