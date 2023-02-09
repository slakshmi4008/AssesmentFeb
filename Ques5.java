package javaQues;

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        String input = "week";
        int start = 1;
        int end = 4;
        String string = input.substring(start, end);
        char[] charArray = string.toCharArray();
        List<List<Character>> ans = new ArrayList<>();
        ans = permute(charArray);
        //System.out.println(ans);
        Set<List<Character>> set = new HashSet<>(ans);
       // System.out.println(set);
        Map<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(List<Character> charSet : set){
            if(isPallindrome(charSet))
                max= Math.max(max,charSet.size());
                map.put(max,map.getOrDefault(max,0)+1);
        }
        //System.out.println(map.get(max));
        System.out.println(max);
    }
    private static boolean isPallindrome(List<Character> charSet){
        for(int i=0,j=charSet.size()-1;i<charSet.size()/2;i++){
            if(charSet.get(i)!=charSet.get(j))
                return false;
        }
        return true;
    }
    private static List<List<Character>> permute(char[] charArray) {
        List<List<Character>> ls = new ArrayList<>();
        permute(0, charArray, ls);
        return ls;
    }
    private static void permute(int ind, char[] charArray, List<List<Character>> ls) {
        if (ind == charArray.length) {
            List<Character> l = new ArrayList<>();
            for (int i = 0; i < charArray.length; i++) {
                l.add(charArray[i]);
            }
            ls.add(new ArrayList(l));
            return;
        }
       for (int i = ind; i < charArray.length; i++) {
            swap(i, ind, charArray);
            permute(ind + 1, charArray, ls);
            swap(i, ind, charArray);
        }
    }
    private static void swap(int i, int j, char[] charArray) {
        char tem = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = tem;
    }
}


