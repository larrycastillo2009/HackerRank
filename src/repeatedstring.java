import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class repeatedstring {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        String nstr = "";
        long counter = 0;
        if(s.equals("a")){
            return n;
        }else{
        for(int i = 0; i <= n; i++){
            if(nstr.length() + s.length() > n){
                String t ="";
                for (int i = 0; i < (n-nstr.length()); i++){
                    t += s.charAt(i);
                }
                nstr = nstr + t;
//                nstr = nstr.substring(0,);
            }else{
                nstr = nstr + s;
            }
        }

        for(int i = 0; i < nstr.length(); i++){
            if(nstr.charAt(i) == 'a'){
                counter++;
            }
        }
        return counter;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(repeatedString("a",10000000000));
//        long result = repeatedString("a", 1000000000000);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }

}




