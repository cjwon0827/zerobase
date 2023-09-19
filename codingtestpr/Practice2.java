package codingtestpr;


public class Practice2 {
    public static void main(String[] args) {
        int answer = solution("one4seveneight");
        System.out.println(answer);
    }

    private static int solution(String s) {
        int answer = 0;
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numArr.length; i++){
            s = s.replace(numArr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
