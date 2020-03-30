import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class SolutionInvilla3 {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        int test3 = 3;
        int test5 = 5;
        for (int i = 1; i <= n; i++) {
            if ((i % test3) == 0 && (i % test5) != 0) {
                System.out.println("Fizz");
            }
            if ((i % test5) == 0  && (i % test3) != 0) {
                System.out.println("Buzz");
            }
            if ((i % test5 != 0) && (i % test3) != 0) {
                System.out.println(i);
            }
            if ((i % test5 == 0) && (i % test3) == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        SolutionInvilla3.fizzBuzz(n);

        bufferedReader.close();
    }
}