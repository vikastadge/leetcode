package com.vikastadge.algo;

/*

 */
public class CheckAnagram {

    public static boolean checkAnagram(String s, String t) {
        int[] count= new int[26];
        if (s.length() != t.length()) return false;
        for (int i=0; i<s.length() ; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i=0; i<count.length ; i++){
            if (count[i] > 0) return false;
        }
        return  true;

    }
    public static void main(String[] args) {
        String s = "listen";
        String t = "silenp";
        System.out.println(checkAnagram(s,t));
    }
}
