import java.util.*;

public class SolutionLetReviewString {

    private static void letReview(int n , String[] input){
        String even = "";
        String odd = "";
        String[] result = new String[n];
        int x=0;
        for (String s : input) {
            for(int i = 0; i < s.length(); i++)
            {
                if(i % 2 == 0){
                    even += s.charAt(i);
                }else{
                    odd += s.charAt(i);
                }
            }

            result[x] = even +" " + odd;
            even = "";odd="";
            x++;
        }

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] cItems = new String[n];
        for (int i = 0; i < n; i++) {
            cItems[i] = scanner.nextLine();
        }

        letReview(n, cItems);
    }
}