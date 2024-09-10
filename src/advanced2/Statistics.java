package advanced2;

import java.io.*;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int total = 0;
        int[] intArr = new int[n];
        LinkedHashMap<Integer, Integer> integerMap = new LinkedHashMap<>();
        Integer maxCnt = 1;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            total += temp;
            intArr[i] = temp;

            if (integerMap.get(temp) == null) integerMap.put(temp, 1);
            else {
                Integer curCnt = integerMap.get(temp) + 1;

                integerMap.put(temp, curCnt);
                if (curCnt >= maxCnt) maxCnt = curCnt;
            }
        }
        Arrays.sort(intArr);

        LinkedList<Integer> maxList = new LinkedList<>();
        for (Integer integer : integerMap.keySet()) {
            Integer currentCnt = integerMap.get(integer);
            if (maxCnt == currentCnt) maxList.push(integer);
        }

        maxList.sort(new AscComperator());


        double avg = (double) total / n;
        int intAvg = (int) Math.round(avg);
        int center = intArr[n / 2];
        int frequent = maxList.size()>1? maxList.get(1) : maxList.get(0);
        int range = intArr[0] - intArr[intArr.length-1];
        if(range<0) range*=-1;

        bw.write(intAvg+"\n"+center+"\n"+frequent+"\n"+range+"\n");
        bw.flush();
        bw.close();
    }
    static class AscComperator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1<o2)? -1:((o2 == o2)? 0: 1);
        }
    }

}


