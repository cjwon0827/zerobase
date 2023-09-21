package lineardspr;

import java.util.HashMap;
import java.util.Stack;

public class Practice4 {
    public static void solution(String str) {
        String[] strArr = str.split("");
        Stack<String> stack = new Stack<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("(") || strArr[i].equals("{") || strArr[i].equals("[")){
                stack.add(strArr[i]);
            } else if(strArr[i].equals(")") || strArr[i].equals("}") || strArr[i].equals("]")){
                if(map.get(stack.peek()).equals(strArr[i])){
                    stack.pop();
                } else {
                    System.out.println("Fail");
                    break;
                }
            }
        }

        if(stack.isEmpty()){
            System.out.println("Pass");
        }
    }

    public static void main(String[] args) {
        // Test code
        solution("[yyyy]-[mm]-[dd]");               // Pass
        solution("System.out.println(arr[0][1))");  // FAIL
        solution("Support [Java or Python(3.x)]");  // PASS
        solution("([[{}])");                        // FAIL
    }
}
