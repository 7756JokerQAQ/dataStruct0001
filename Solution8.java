package text;

import java.util.Arrays;

public class Solution8 {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        int count2=0;
        int temp[]=new int[nums.length];
        temp=  Arrays.copyOf(nums,nums.length);
        for(int i=0;i+1<nums.length;i++){
            nums[i]=nums[i+1]-nums[i];
            if(nums[i]<0){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        for(int i=0;i+2<nums.length;i++){
            temp[i]=temp[i+2]-temp[i];
            if(temp[i]<0){
                count2++;
                if(count2>1){
                    return false;
                }
            }
        }
        return true;
    }
}
