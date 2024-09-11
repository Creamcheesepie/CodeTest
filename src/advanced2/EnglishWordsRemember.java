package advanced2;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class EnglishWordsRemember{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] strArr = input.split(" ");
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for(int i = 0 ; i<n;i++){
            input = br.readLine();
            if(input.length()<m)continue;
            if(linkedHashMap.get(input) ==null) linkedHashMap.put(input,1);
            else{
                linkedHashMap.replace(input,linkedHashMap.get(input)+1);
            }
        }




    }
    
    
}
