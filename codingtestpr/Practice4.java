package codingtestpr;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        int[] numArr = new int[num];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        for(int i = 0; i < numArr.length - 1; i++){
            for(int j = i+1; j < numArr.length; j++){
                result += numArr[i] ^ numArr[j];
            }
        }
        System.out.println(result);
        sc.close();
    }


}
