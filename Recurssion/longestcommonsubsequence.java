package Recurssion;

import java.io.*;
import java.util.*;

public class longestcommonsubsequence {
    int lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+lcs(s1, s2, m-1, n-1);
        }
        else{
            return max(lcs(s1, s2, m, n-1),lcs(s1, s2, m-1, n));
        }

    }

    int max(int a, int b){return (a>b)?a:b;}
    public static void main(String args[]){
        String s1 = "aggtab";
        String s2 = "gxtxayb";

        int m = s1.length();
        int n = s2.length();
        longestcommonsubsequence obj = new longestcommonsubsequence();

        System.out.println(obj.lcs(s1, s2, m, n));

    }
}
