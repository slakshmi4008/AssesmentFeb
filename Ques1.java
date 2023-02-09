package javaQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques1 {
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
        System.out.println("Enter the total amount");
        int amount =sc.nextInt();
        findPriceList(nums,amount);
    }
    private static void findPriceList(int[] nums, int amount){
        List<Integer> ans = new ArrayList<>();
        for(int firstIndex=0;firstIndex<nums.length;firstIndex++){
            for(int secondIndex=firstIndex+1;secondIndex<nums.length;secondIndex++){
                if(nums[secondIndex]+nums[firstIndex]==amount){
                    ans.add(firstIndex+1);
                    ans.add(secondIndex+1);
                }
            }
        }
        System.out.println(ans);
    }
}
