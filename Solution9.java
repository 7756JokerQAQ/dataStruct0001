package text;

import java.util.ArrayList;
import java.util.List;

public class Solution9 {
    public List<List<Integer>> generate(int numRows) {

         List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> q=new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if(j==1||j==i){
                    q.add(1);
                }else{
                   q.add(res.get(i-2).get(j-2)+res.get(i-2).get(j-1));

                }
            }
            res.add(q);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution9 s=new Solution9();
        s.generate(5);
    }
}
