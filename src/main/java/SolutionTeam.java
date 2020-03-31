import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class SolutionTeam {

    private static int countOccurences(
            String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + countOccurences(
                someString, searchedChar, index + 1);
    }

    /*
     * Complete the 'perfectTeam' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING skills as parameter.
     */

    public static int perfectTeam(String skills) {
        // Write your code here
        int p = 0;
        int c = 0;
        int m = 0;
        int b = 0;
        int z = 0;

        for (int i = 0; i < skills.length(); i++) {
        if(skills.charAt(i) == 'p'){
        p++;
        }
        }
        for (int i = 0; i < skills.length(); i++) {
        if(skills.charAt(i) == 'c'){
        c++;
        }
        }
        for (int i = 0; i < skills.length(); i++) {
        if(skills.charAt(i) == 'm'){
        m++;
        }
        }
        for (int i = 0; i < skills.length(); i++) {
        if(skills.charAt(i) == 'b'){
        b++;
        }
        }
        for (int i = 0; i < skills.length(); i++) {
        if(skills.charAt(i) == 'z'){
        z++;
        }
        }

        List<Integer> list = new ArrayList<>();
        list.add(p);
        list.add(c);
        list.add(m);
        list.add(b);
        list.add(z);

        Collections.sort(list);

        if(p>0){
            return list.get(0);
        } else{
            return 0;
        }




    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String skills = bufferedReader.readLine();

        int result = SolutionTeam.perfectTeam(skills);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
