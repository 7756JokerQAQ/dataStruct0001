package text;

import java.util.*;

public class Solution4 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
       Set<Integer>set=new TreeSet<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
           set.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if(!set.contains(i+1)){
                list.add(i+1);
            }
        }
        return list;
    }
}
