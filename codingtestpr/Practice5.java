package codingtestpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        HashSet<Integer> set = new HashSet<>();
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int i = 0; i < numArr.length; i++) {
            set.add(numArr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < numArr.length; j++) {
                if (list.get(i) == numArr[j]) {
                    count++;
                }
            }
            ht.put(list.get(i), count);
        }

        if (ht.get(v) == null) {
            System.out.println(0);
        } else {
            System.out.println(ht.get(v));
        }
        sc.close();
    }


}
