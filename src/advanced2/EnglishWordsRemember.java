package advanced2;

import java.io.*;
import java.util.*;

public class EnglishWordsRemember{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] strArr = input.split(" ");
        int maxFrequent = 0;
        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for(int i = 0 ; i<n;i++){
            input = br.readLine();
            if(input.length()<m)continue;

            if(linkedHashMap.get(input) ==null) linkedHashMap.put(input,1);
            else{
                Integer recentFrequent = linkedHashMap.get(input)+1;
                linkedHashMap.replace(input,recentFrequent);
                if(maxFrequent<recentFrequent)maxFrequent = recentFrequent;
            }
        }

        ArrayList<LinkedList<String>> strArrList = new ArrayList<>();
        int tempCnt = 0;
        for(int i = maxFrequent; i > 0; i--){
            LinkedList<String> strings = new LinkedList<>();
            for (String string : linkedHashMap.keySet()) {
                if(linkedHashMap.get(string) == i) {
                    strings.add(string);
                }
            }
            strArrList.add(strings);
            tempCnt++;
        }
    }
}
