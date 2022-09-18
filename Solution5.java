package text;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer>res=new ArrayList<>();
    int []temp=new int[nums.length];
        for (int num :
                nums) {
            temp[num-1]++;

        }
        for (int i = 0; i < nums.length; i++) {
            if(temp[i]==2){
                res.add(i+1);
            }
        }
    return res;
    }
}
