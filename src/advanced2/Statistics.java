package advanced2;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int total = 0;
        int[] intArr = new int[n];
        int[][] frequentArr = new int[n][1];


        for(int i = 0;i<n;i++){
            int temp = Integer.parseInt(br.readLine());
            total += temp;
            intArr[i] = temp;
            //최빈값 처리 방법 고민
        }
        Arrays.sort(intArr);

        double avg = (double)total/n;
        int intAvg = (int) Math.round(avg);
        int center = intArr[n/2];
        int frequent = 0;
        int range = intArr[0]-intArr[1];


    }
}
