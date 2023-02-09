package javaQues;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        int value=sc.nextInt();
        int nums[][]=new int[value][value];
        int size=value-1;
        int element=1;
        for(int i=0;i<=value/2;i++)
        {

            for(int j=i;j<value-i;j++)
            {
                nums[i][j]=element;
            }
            for(int k=i;k<value-i;k++)
            {
                nums[k][size-i]=element;
            }
            for(int l=i;l<value-i;l++)
            {
                nums[size-i][l]=element;
            }
            for(int m=i;m<value-i;m++)
            {
                nums[m][i]=element;
            }
            if(element==1)
            {
                element=0;
            }
            else
            {
                element=1;
            }
        }
        for(int[] i:nums)
        {
            for(int j=0;j<i.length;j++)
            {
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }

    }
}

