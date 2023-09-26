package lineardspr2;

import java.util.Stack;

public class Practice2 {
    public static void solution(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num > idx){
                for(int j = idx + 1; j <= num; j++){
                    stack.push(j);
                    sb.append("+");
                }
                idx = num;
            } else if (stack.peek() != num){
                System.out.println("No");
                return;
            }
            stack.pop();
            sb.append("-");
        }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 8, 7, 5, 2, 1};
        solution(nums);

        System.out.println("=====");
        nums = new int[]{1, 2, 5, 3, 4};
        solution(nums);
    }
}
