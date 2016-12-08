package com.sun;

/**
 * Created by sunbinqiang on 08/12/2016.
 */
public class PalindromicString5 {

    public String longestPalindrome(String s) {
        if(s.length() < 1) return "";
        String res = s.substring(0, 1);
        int maxLen = 1;
        int curLen = 1;
        char[] charList = s.toCharArray();
        int len = charList.length;
        int j = 0;
        for(int i = 0; i < len; i ++){
            //奇数
            for(j = 1; i - j >= 0 && i + j < len; j ++){
                if(charList[i - j] != charList[i+j]){
                    break;
                }
                curLen = j * 2 + 1;
            }
            j = j-1;
            if(curLen > maxLen){
                maxLen = curLen;
                res = s.substring(i-j, i+j+1);
            }
            //偶数
            for(j = 1; i - j + 1 >=0 && i+j < len; j ++){
                if(charList[i - j + 1] != charList[i+j]){
                    break;
                }
                curLen = j * 2;
            }
            j = j - 1;
            if(curLen > maxLen){
                maxLen = curLen;
                res = s.substring(i-j+1, i+j+1);
            }
        }

        return res;

    }
}
