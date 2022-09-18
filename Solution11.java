package text;

public class Solution11 {
    public int countBattleships(char[][] board) {
        //逐行扫描
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    if (j - 1 < 0 && board[i][j + 1] == '.') {
                        count++;
                    } else if (board[i][j - 1] == '.' && j + 1 > board[i].length - 1) {
                        count++;
                    } else if (board[i][j - 1] == '.' && board[i][j + 1] == '.') {
                        count++;
                    }

                }
                max1 = Math.max(max1, count);
            }
        }
        //逐列扫描
        for (int i = 0; i < board[0].length; i++) {
            int count2 = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'X') {
                    if (j - 1 < 0 && board[j + 1][i] == '.') {
                        count2++;
                    } else if (board[j - 1][i] == '.' && j + 1 > board.length - 1) {
                        count2++;
                    } else if (board[j-1][i] == '.' && board[j+1][i] == '.') {
                        count2++;
                    }
                }
                max2=Math.max(max1,count2);
            }
        }
        return Math.max(max1,max2);
    }
}
