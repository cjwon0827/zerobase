package lineardspr2;

import java.util.*;

public class Practice3 {
    public static void solution(String[] genres, int[] plays) {
        HashSet<String> set = new HashSet<>(Arrays.asList(genres));
        ArrayList<String> setList = new ArrayList<>(set);
        ArrayList<Integer> playCount = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < setList.size(); i++) {
            int count = 0;
            for (int j = 0; j < genres.length; j++) {
                if (setList.get(i).equals(genres[j])) {
                    count += plays[j];
                }
            }
            playCount.add(count);
            map.put(count, setList.get(i));
        }
        playCount.sort(Comparator.reverseOrder());


        for (int i = 0; i < playCount.size(); i++) {
            if (i == 2) {
                break;
            }

            ArrayList<Integer> playsList = new ArrayList<>();
            for (int j = 0; j < genres.length; j++) {
                if (map.get(playCount.get(i)).equals(genres[j])) {
                    playsList.add(plays[j]);
                }
            }
            playsList.sort(Comparator.reverseOrder());
            for (int k = 0; k < playsList.size(); k++) {
                if (k == 2) {
                    break;
                }

                for (int a = 0; a < plays.length; a++) {
                    if (playsList.get(k) == plays[a]) {
                        resultList.add(a);
                    }
                }
            }
        }
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        // Test code
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);

    }
}
