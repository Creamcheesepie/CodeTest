package advanced2;

import java.io.*;
import java.util.HashSet;

public class DanceChongChong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        HashSet<String> dancingChongChong = new HashSet<>();
        dancingChongChong.add("ChongChong");

        for(int i =0 ; i<n; i++){
            input = br.readLine();
            String[] strArr = input.split(" ");
            if(dancingChongChong.contains(strArr[0])) dancingChongChong.add(strArr[1]);
            if(dancingChongChong.contains(strArr[1])) dancingChongChong.add(strArr[0]);
        }

        bw.write(dancingChongChong.size()+"");
        bw.flush();
        bw.close();
    }
}
