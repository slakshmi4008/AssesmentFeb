package javaQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();

        int[] nums = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans =helper(nums);
        System.out.println(ans);

    }
    private static List<List<Integer>> helper(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,nums,ans,new ArrayList<>());
        return ans;
    }
    private static void subset(int index,int[] nums,List<List<Integer>> ans,ArrayList<Integer> list){
        if(index==nums.length){
            ans.add( new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subset(index+1,nums,ans,list);
        list.remove(list.size()-1);
        subset(index+1,nums,ans,list);

    }
}
