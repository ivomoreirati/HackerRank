import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class SolutionEmailThreads {

    /*
     * Complete the 'getEmailThreads' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts STRING_ARRAY emails as parameter.
     */

    public static List<List<Integer>> getEmailThreads(List<String> emails) {
        // Write your code here
        List<List<Integer>> list  = new ArrayList<>();

        List<List<String>> result =
        emails.stream().map(s -> Arrays.asList(s.split(",")))
                .collect(Collectors.toList());
        Map<String, Integer> aux = new HashMap<>();

        result.forEach(strings -> {
            strings.forEach(s -> {
                aux.put(s, strings.indexOf(s) + 1);
            });

        });

//        list.set(1 , new ArrayList<>());
//        List<Integer> test = new ArrayList<>();
//        result.forEach(strings -> {
//            strings.forEach(s -> {
//                if(strings.indexOf(s) == 0){
//                    test.add(Integer.valueOf(1));
//                    list.set(1,test);
//                }
//                if(list.stream().anyMatch(integers -> )){
//
//                }
//            });
//
//        });

        return null;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int emailsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> emails = IntStream.range(0, emailsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        List<List<Integer>> result = SolutionEmailThreads.getEmailThreads(emails);

        result.stream()
                .map(
                        r -> r.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}