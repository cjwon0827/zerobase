package arrpr;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        arr = solution(arr, divisor);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for(int num : arr){
            if(num % divisor == 0){
                count++;
            }
        }
        if(count == 0){
            answer = new int[]{-1};
        } else {
            answer = new int[count];
        }
        for (int i : arr) {
            if (i % divisor == 0) {
                answer[count - 1] = i;
                count--;
            }

            if (count == 0) {
                break;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}
