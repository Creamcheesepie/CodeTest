package advanced2;

import java.io.*;
import java.util.HashSet;

public class HelloGomGom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        HashSet<String> set = new HashSet<>();
        HashSet<String> enter = new HashSet<>();
        enter.add("ENTER");
        int res = 0;

        for(int i =0;i<n;i++){
            input = br.readLine();
            if(enter.contains(input)){
                res += set.size();
                set = new HashSet<>();
            }else {
                set.add(input);
            }
        }
        res += set.size();

        bw.write(res+"");
        bw.flush();
        bw.close();
    }
}
