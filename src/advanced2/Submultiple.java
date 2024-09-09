package advanced2;

import java.io.*;
import java.util.Arrays;

public class Submultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int arr[] = new int[n];
        input = br.readLine();
        String sarr[] = input.split(" ");

        for(int i = 0 ; i<n;i++){
            arr[i] = Integer.parseInt(sarr[i]);
        }

        Arrays.sort(arr);

        int res = 0;
        if(n==1) {
            res = arr[0] * arr[0];
        }else {
            res =  arr[0] * arr[n-1];
        }


        bw.write(res+"");
        bw.flush();
        bw.close();
    }
}
