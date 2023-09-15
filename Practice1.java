package arrpr;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000001;
        int min = 1000001;

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        System.out.print(min + " " + max);
        sc.close();
    }
}
