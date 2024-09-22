package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        System.out.println(fiboMachine(n));
    }

    public static long fiboMachine(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fiboMachine(n-1)+fiboMachine(n-2);
    }
}
