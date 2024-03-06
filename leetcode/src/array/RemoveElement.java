package array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        int len=0;
        len=removeElement(nums,val);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeElement(int[] nums,int val){
        int len=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==val){
                nums[i]=nums[len-1];
                len--;
            }
        }
        return len;
    }
}
