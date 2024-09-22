package recursive;

import java.io.*;

public class Factorial2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input  = br.readLine();
        int n = Integer.parseInt(input);
        System.out.println(facto(n));
    }

    public static long facto(int n){
        if(n<=0){
            return 1;
        }
        return n*facto(n-1);
    }
}
