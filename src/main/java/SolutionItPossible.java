import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class SolutionItPossible {

    /*
     * Complete the 'isPossible' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     *  3. INTEGER c
     *  4. INTEGER d
     */

    public static String isPossible(int a, int b, int c, int d) {
        // Write your code here

        if(a+b == c && ((a+b) + c) == d){
            return "YES";
        }

        return "NO";

    }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int a = Integer.parseInt(bufferedReader.readLine().trim());

            int b = Integer.parseInt(bufferedReader.readLine().trim());

            int c = Integer.parseInt(bufferedReader.readLine().trim());

            int d = Integer.parseInt(bufferedReader.readLine().trim());

            String result = SolutionItPossible.isPossible(a, b, c, d);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
