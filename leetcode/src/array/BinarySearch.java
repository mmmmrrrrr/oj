package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={5};
        int target=5;
        int result=search(nums,target);
        System.out.println(result);
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        int flag=-1;
        while(left<=right){
            if(nums[mid]==target){
                flag=mid;
                break;
            }
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        return flag;
    }
}
