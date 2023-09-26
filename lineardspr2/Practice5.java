package lineardspr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice5 {
    public static ArrayList<Integer> solution(String[] gems) {
        HashSet<String> set = new HashSet<>(Arrays.asList(gems));
        ArrayList<ArrayList<Integer>> distanceList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        int count = 0;
        int min = 100001;

        if (gems.length == set.size()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(set.size());
            distanceList.add(list);
        } else {
            for (int i = 0; i < gems.length; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                HashSet<String> checkSet = new HashSet<>();
                list.add(i + 1);
                for (int j = i; j < gems.length; j++) {
                    if (checkSet.size() == set.size()) {
                        list.add(j);
                        break;
                    } else {
                        checkSet.add(gems[j]);
                    }
                }
                distanceList.add(list);
            }
        }

        for (int i = 0; i < distanceList.size(); i++) {
            if (distanceList.get(i).size() == 1) {
                count++;
            } else {
                resultList.add(distanceList.get(i).get(1) - distanceList.get(i).get(0));
            }

            if(count == distanceList.size()){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(1);
                result.add(distanceList.size());
                return result;
            }
        }

        for(int i = resultList.size() - 1; i >= 0; i--){
            if(min > resultList.get(i)){
                min = resultList.get(i);
            }
        }

        for(int i = 0; i < resultList.size(); i++){
            if(min == resultList.get(i)){
                return distanceList.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Test code
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(solution(gems));

        gems = new String[]{"AA", "AB", "AC", "AA", "AC"};
        System.out.println(solution(gems));

        gems = new String[]{"XYZ", "XYZ", "XYZ"};
        System.out.println(solution(gems));

        gems = new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
        System.out.println(solution(gems));
    }
}
