package text;

import java.util.Arrays;

public class Solution10 {
    public int[][] imageSmoother(int[][] img) {
        int temp[][] = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                temp[i][j] = SumAvg(img, i, j);
            }
        }
        return temp;
    }

    private int SumAvg(int[][] img, int r, int c) {
        int count = 1;
        int sum = img[r][c];
        //上
        if (r - 1 >= 0) {
            count++;
            sum += img[r - 1][c];
        }
        //下
        if (r + 1 <= img.length - 1) {
            sum += img[r + 1][c];
            count++;
        }
        //左
        if (c - 1 >= 0) {
            sum += img[r][c - 1];
            count++;
        }
        //右
        if (c + 1 <= img[r].length - 1) {
            sum += img[r][c + 1];
            count++;
        }
        //左上
        if (r - 1 >= 0 && c - 1 >= 0) {
            count++;
            sum += img[r - 1][c - 1];
        }
        //左下
        if ((r + 1 <= img.length - 1) && c - 1 >= 0) {
            sum += img[r + 1][c - 1];
            count++;
        }
        //右上
        if (r - 1 >= 0 && (c + 1 <= img[r-1].length - 1)) {
            sum += img[r - 1][c + 1];
            count++;
        }
        //右下
        if ((r + 1 <= img.length - 1) && (c + 1 <= img[r+1].length - 1)) {
            sum += img[r + 1][c + 1];
            count++;
        }

        return sum / count;
    }

    public static void main(String[] args) {
        Solution10 s=new Solution10();
        int [][]temp={{1,1,1},{1,0,1},{1,1,1}};
        s.imageSmoother(temp);
    }
}
