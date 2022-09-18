package text02;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
 /*   public List<Integer> spiralOrder(int[][] matrix) {
        int temp[][]=new int[matrix.length][matrix[0].length];
        List<Integer>res=new ArrayList<>();
         over(matrix,temp,res ,0, 0);
         return res;

    }
    private boolean over(int[][]matrix,int temp[][],List<Integer> res,int r,int c){
            if(temp[matrix.length/2][matrix[0].length/2]==1){
               return true;
            }
            temp[r][c]=1;
            res.add(matrix[r][c]);
            if(c+1<matrix[0].length&&temp[r][c+1]==0){
              return   over(matrix,temp,res,r,c+1);
            }
            if(r+1<matrix.length&&temp[r+1][c]==0){
             return    over(matrix,temp,res,r+1,c);
            }
            if(c-1>=0&&temp[r][c-1]==0){
             return    over(matrix,temp,res,r,c-1);
            }
            if(r-1>=0&&temp[r-1][c]==0){
             return    over(matrix,temp,res,r-1,c);
            }
        return true;
    }*/
 public List<Integer> spiralOrder(int[][] matrix) {
     int temp[][]=new int[matrix.length][matrix[0].length];
     List<Integer>res=new ArrayList<>();
     over(matrix,temp,res ,0, 0);
     return res;
     /*
     1  2  3  4
     5  6  7  8
     9  10 11 12
     13 14 15 16
      */

 }
    private boolean over(int[][]matrix,int temp[][],List<Integer> res,int r,int c){
        temp[r][c]=1;
        res.add(matrix[r][c]);
        if(c+1<matrix[0].length&&temp[r][c+1]==0){
            over(matrix,temp,res,r,c+1);
        }
        if(r+1<matrix.length&&temp[r+1][c]==0){
            over(matrix,temp,res,r+1,c);
        }
        if(c-1>=0&&temp[r][c-1]==0){
            over(matrix,temp,res,r,c-1);
        }
        if(r-1>=0&&temp[r-1][c]==0){
            over(matrix,temp,res,r-1,c);
        }
        return true;
    }
    public static void main(String[] args) {
        int [][]m={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution2 solution2 = new Solution2();
        solution2.spiralOrder(m);
    }
}
