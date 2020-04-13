//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class SolutionMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> dictionary = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dictionary.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dictionary.get(s)!= null){
                System.out.println(s+"="+dictionary.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}