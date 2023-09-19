package codingtestpr;

import java.util.Scanner;
import java.util.Stack;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] bracket = new String[num];

        for(int i = 0; i < bracket.length; i++){
            bracket[i] = sc.next();
            String[] splitArr = bracket[i].split("");
            String answer = solution(splitArr);
            System.out.println(answer);
        }

    }

    private static String solution(String[] splitArr) {
        String result = "";
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < splitArr.length; i++){
            if(i == 0 && splitArr[i].equals(")")){
                result = "NO";
                return result;
            }

            if(splitArr[i].equals("(")){
                stack.add(splitArr[i]);
            } else {
                if(stack.isEmpty()){
                    stack.add(splitArr[i]);
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            result = "YES";
        } else {
            result = "NO";
        }

        return result;

    }

}
