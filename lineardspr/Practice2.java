package lineardspr;

import java.util.ArrayList;

public class Practice2 {

    public static void solution(int[][] matrix) {
        ArrayList<Integer> rowList = new ArrayList<>();
        ArrayList<Integer> colList = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowList.add(i);
                    colList.add(j);
                }
            }
        }

        for(int i = 0; i < rowList.size(); i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[j][rowList.get(i)] = 0;
                for(int k = 0; k < matrix[j].length; k++){
                    matrix[colList.get(i)][k] = 0;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution(matrix);

        System.out.println();
        matrix = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        solution(matrix);
    }
}
