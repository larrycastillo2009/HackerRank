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

class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int alt = 0;
        int valley = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (alt == -1) {
                    valley++;
                }
                alt++;
            }
            if (path.charAt(i) == 'D') {
                alt--;
            }
        }
        return valley;


    }




public static void main(String[]args)throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps=Integer.parseInt(bufferedReader.readLine().trim());

        String path=bufferedReader.readLine();

        int result=CountingValleys.countingValleys(steps,path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        }
        }


