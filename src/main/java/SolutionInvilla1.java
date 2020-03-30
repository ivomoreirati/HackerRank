import java.io.IOException;
import java.util.Scanner;

public class SolutionInvilla1 {

    static int test(int a, int b) {
        int c = 0;

        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        String cc = "";
        cc = aa.substring(0, 1);
        cc += bb.substring(0, 1);
        cc += (aa.length() > 1 ? aa.substring(1, 2): "");
        cc += (bb.length() > 1 ? bb.substring(1, 2): "");

        if(aa.length() > 1 && bb.length() > 1) {
            if (a > b) {
                cc += bb.substring(2, bb.length()) + aa.substring(2, aa.length());
            } else {
                cc += aa.substring(2, aa.length()) + bb.substring(2, bb.length());
            }
        }

        int result = Integer.parseInt(cc);
        if(result > 1000000){
            return -1;
        }

        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int a = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int b = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = test(a, b);
        scanner.close();
        System.out.println(result);

    }
}
