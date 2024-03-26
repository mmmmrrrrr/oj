package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] result=sortedSquares(nums);
        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        while(i<=j&&k>=0){
            if(nums[i]*nums[i]>=nums[j]*nums[j]){
                result[k]=nums[i]*nums[i];
                i++;
                k--;
            }else{
                result[k]=nums[j]*nums[j];
                j--;
                k--;
            }
        }
        return result;
    }
}
