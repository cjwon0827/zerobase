package lineardspr2;

import java.util.Hashtable;
import java.util.Map;

public class Practice4 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Hashtable<String, Integer> ht = new Hashtable<>();
        for(int i = 0; i < completion.length; i++){
            int count = 0;
            for(int j = 0; j < participant.length; j++){
                if(completion[i].equals(participant[j])){
                    count++;
                }
            }
            ht.put(completion[i], count);
        }

        for(int i = 0; i < participant.length; i++){
            if(ht.get(participant[i]) == null){
                answer = participant[i];
            }
        }

        for(Map.Entry<String, Integer> item : ht.entrySet()){
            if(item.getValue() != 1){
                answer = item.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // Test code
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));

        participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant, completion));

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }
}
