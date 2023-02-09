package javaQues;

import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
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
        System.out.println("Enter the trailing says");
        int trailingDays =sc.nextInt();
        int[] nums1 ={2,3,4,2,3,6,8,4,5};
        int trailingDays1=5;
        findNotificationDays(nums1,trailingDays1);
    }
    private static void findNotificationDays(int[] nums,int trailingDays){
        int sum=0;
        int median =0;
        int count=0;
        int[] sumArray = new int[nums.length-trailingDays+1];
        int sumArrayIndex=0;

        for(int index=0;index<=nums.length-1;index++){
            sum=sum+nums[index];
            count++;
            if(count==trailingDays){
                sumArray[sumArrayIndex++]=sum/5;
                count--;
                sum=sum-nums[index-(nums.length-trailingDays)];
            }

        }
        System.out.println(Arrays.toString(sumArray));

        int ans=0;
        sumArrayIndex=0;

        for(int index=0;index<nums.length-trailingDays;index++){
            int index1=index;
            int temp=trailingDays;
            int maxExp=0;
            while(temp>0) {
                if (nums[index1++] >=sumArray[sumArrayIndex]) maxExp++;
                temp--;
            }
            if(maxExp==trailingDays) ans++;
            sumArrayIndex++;
        }
        System.out.println(ans);

    }
}
