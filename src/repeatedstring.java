import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class repeatedstring {
    static long repeatedStrings(String s, long n) {
        if (s.equals("a")) return n;
        long count = countIt(s, s.length());
        long div = n / s.length();
        return (div * count) + countIt(s, n % s.length());
    }

    public static long countIt(String s, long times){
        long count = 0;
        for (int i=0; i<times;i ++){
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        System.out.println(repeatedStrings("a",10000000000));

    }

}




