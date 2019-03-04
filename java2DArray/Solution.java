import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int sumMax = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                sum += arr[j][i] + arr[j][i + 1] + arr[j][i + 2] +
                        +arr[j + 1][i + 1] + arr[j + 2][i] + arr[j + 2][i + 1] + arr[j + 2][i + 2];

                if(sum > sumMax) sumMax = sum;
                sum = 0;
            }


        }
        System.out.println(sumMax);

    }
}
