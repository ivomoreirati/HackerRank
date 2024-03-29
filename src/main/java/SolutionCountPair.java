import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionCountPair {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    int count = 0;
    int result = 0;
    Map<Integer, Integer> aux = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(!aux.containsValue(ar[i])){
                for(int j=0; j<n; j++){
                    if(ar[i] == ar[j]){
                        count++;
                    }
                }
                aux.put(i, ar[i]);
                result += count / 2;
                count = 0;
            }
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
