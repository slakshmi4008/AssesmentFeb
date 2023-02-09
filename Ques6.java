package javaQues;

import java.util.Arrays;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length N :");
        int len = sc.nextInt();

        int[][] nums = new int[len][len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for (int i = 0; i < len; i++) {
            for(int j=0;j<len;j++)
               nums[i][j] = sc.nextInt();
        }
        int[][] nums1 ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        rotateMatrix(nums1,3);
    }
    private static void rotateMatrix(int[][] nums,int len){
        int[][] transpose = new int[len][len];
        //find tranpose of the matrix
        for (int i = 0; i < len; i++) {
            for(int j=0;j<len;j++)
                transpose[i][j] = nums[j][i];
        }
        System.out.println(Arrays.deepToString(transpose));
        //swap the rows of the matrix

        for (int i = 0,n=len-1; i < len/2; i++,n--) {
            for(int j=0;j<len;j++){
                int temp=transpose[i][j];
                transpose[i][j]=transpose[n][j];
                transpose[n][j]=temp;
            }

        }
        System.out.println(Arrays.deepToString(transpose));

    }
}
