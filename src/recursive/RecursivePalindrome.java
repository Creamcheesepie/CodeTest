package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursivePalindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        StringBuilder  outLine = new StringBuilder();
        for(int i = 0 ;i < n; i++){
            input = br.readLine();
            int res[] = isPalindrome(input);
            outLine.append(res[0]+" "+res[1]+"\n");
        }
        System.out.println(outLine);
    }

    public static int[] isPalindrome(String str){
        return recursion(str,0,str.length()-1,0);
    }

    public static int[] recursion(String str,int l, int r,int cnt){
        cnt++;
        if(l>=r) return new int[]{1,cnt};
        else if(str.charAt(l) != str.charAt(r)) return new int[]{0,cnt};
        else return recursion(str,l+1,r-1,cnt);
    }
}
