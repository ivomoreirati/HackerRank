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



class Result {

    /*
     * Complete the 'minNum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER A
     *  2. INTEGER K
     *  3. INTEGER P
     */

    public static int minNum(int A, int K, int P) {
        // Write your code here
        int initialAsha = A + P;
        if(initialAsha < K){
            return 1;
        }
        int i =0;
        int k = K;
        for(i=1;i<100;i++){
            if(initialAsha < k){
                return i;
            } else {
                k += K;
                initialAsha += A;
            }
        }
        return -1;
    }

}

//public class Solution {
//
//}