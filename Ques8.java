package javaQues;

import java.util.Arrays;

public class Ques8 {
    public static void main(String[] args) {
        int[] nums = {1,5,2,3,4};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
