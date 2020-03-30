import java.util.Scanner;

public class SolutionTestScanner {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        double dd = 0.0;
        int ii = 0;
        ii = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        dd = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ss = scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder string = new StringBuilder();
        string.append(s);
        string.append(ss);

        System.out.println(i+ii);
        System.out.println(d+dd);
        System.out.println(string.toString());
        scan.close();
    }
}