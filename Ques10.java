package javaQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques10 {
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
        System.out.println("Enter the integer k");
        int amount =sc.nextInt();
        int[] nums1 ={1,2,3,4,5,6};
        int k=5;
        findDivisibleByk(nums1,k);
    }
    private static void findDivisibleByk(int[] nums,int k){
        List<List<Integer>> ans = new ArrayList<>();


        for(int index=0;index<nums.length-1;index++){
            for(int index1=index+1;index1<nums.length;index1++){
                if((nums[index]+nums[index1])%k==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[index]);
                    list.add(nums[index1]);
                    ans.add(list);
                }
            }
        }
        System.out.println(ans);
    }

}
