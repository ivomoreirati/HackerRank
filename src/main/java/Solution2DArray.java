import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution2DArray {

    // Complete the hourglassSum function below.
    private static int sumRow(int rowIndex, int startColIndex, int endcolIndex, int[][] array) {

        int sum = 0;
        for(int col = startColIndex; col <= endcolIndex; col ++ ) {
            sum = sum + array[rowIndex][col];
        }
        return sum;
    }

    private static int hourglassSum(int[][] arr) {
        int maxRow = 6, maxCol = 6, rowIndex = 0, columnIndex = 0, maxValue = 0;
        while(true) {
            //Hour Glass Sum
            int rowOne = sumRow(rowIndex, columnIndex, columnIndex + 2, arr);
            int rowTwo = arr[rowIndex + 1] [columnIndex + 1];
            int rowThree = sumRow(rowIndex + 2, columnIndex, columnIndex + 2, arr);

            int total = rowOne + rowTwo + rowThree;

            if((rowIndex == 0 && columnIndex == 0 ) || maxValue < total) {
                maxValue = total;
            }

            columnIndex++;
            if(columnIndex >= maxCol - 2) {
                rowIndex++;
                columnIndex = 0;
            }
            if(rowIndex >= maxRow - 2 )
                break;
        }
        return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
