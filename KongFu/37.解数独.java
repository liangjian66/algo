/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }

    private boolean backtracking(char[][] board){
        //「一个for循环遍历棋盘的行，一个for
        
        for(int row = 0; row < 9; row++){
            // 循环遍历棋盘的列，
            for(int col = 0; col < 9; col++){
                // 不需要填的，跳过
                if(board[row][col] != '.') continue;
                // 一行一列确定下来之后，递归遍历这个位置放9个数字的可能性！」
                for(char k = '1'; k <= '9'; k++){
                    if(isValid(board,row,col,k)){
                        board[row][col] = k;
                        // 如果找到合适一组立刻返回
                        if(backtracking(board)) return true;    
                        board[row][col] = '.';
                    }
                }
                // 9个数都试完了，都不行，那么就返回false
                // 因为如果一行一列确定下来了，这里尝试了9个数都不行，说明这个棋盘找不到解决数独问题的解！
                // 那么会直接返回， 「这也就是为什么没有终止条件也不会永远填不满棋盘而无限递归下去！」
                return false;
            }
        }
        // 遍历完没有返回false，说明找到了合适棋盘位置了
        return true;
    }

    // 三个维度检查数是否符合
    private boolean isValid(char[][] board, int row, int col, char value){
        //检查行
        for(int i = 0; i < 9; i++){
            if(board[row][i] == value) return false;
        }

        //检查列
        for(int i = 0; i < 9; i++){
            if(board[i][col] == value) return false;
        }

        // 检查9宫格
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for(int i = startRow; i < startRow + 3;i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == value) return false;
            }
        }

        return true;
    }
}

// @lc code=end

