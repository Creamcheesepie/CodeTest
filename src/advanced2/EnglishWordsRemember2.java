package advanced2;

import java.io.*;
import java.util.*;

public class EnglishWordsRemember2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] strArr = input.split(" ");
        HashMap<String, Integer> wordsMap = new HashMap<>();

        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        for(int i = 0; i<n; i++){
            input = br.readLine();
            if(input.length()<m) continue;
            wordsMap.put(input, wordsMap.getOrDefault(input,0)+1);
        }

        List<String> wordsList = new LinkedList<>(wordsMap.keySet());

        Collections.sort(wordsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.compare(wordsMap.get(o1), wordsMap.get(o2)) != 0) {
                    return Integer.compare(wordsMap.get(o2), wordsMap.get(o1));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String string : wordsList) {
            sb.append(string +"\n");
        }
        System.out.println(sb);
    }

}
