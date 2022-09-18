package text;

import java.util.Set;
import java.util.TreeSet;

public class Solution6 {
    public int firstMissingPositive(int[] nums) {
        int temp=0;
        Set<Integer>set=new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < set.size(); i++) {
            if(!set.contains(i+1)){
               temp=i+1;
               break;
            }
        }
        return temp;
    }
}
