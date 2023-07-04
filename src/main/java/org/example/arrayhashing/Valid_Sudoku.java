package org.example.arrayhashing;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        int rowNum = board[0].length;
        int colNum = board.length;

        IntStream.range(0, rowNum).allMatch(colIndex -> {
            Set<Character> set = new HashSet<>();
            return IntStream.range(0, rowNum).filter(rowIndex -> board[colIndex][rowIndex] != '.')
                    .mapToObj(rowIndex -> board[colIndex][rowIndex])
                    .allMatch(set::add);
        });

        IntStream.range(0, colNum).allMatch(rowIndex -> {
            Set<Character> set = new HashSet<>();
            return IntStream.range(0, rowIndex).filter(colIndex -> board[rowIndex][colIndex] != '.')
                    .mapToObj(colIndex -> board[rowIndex][colIndex])
                    .allMatch(set::add);
        });



        return true;
    }

    public static void main(String[] args) {

    }
}
    /*public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int column = board.length;
        Set rowSet = null;
        Set columnSet = null;
        Set blockSet = null;

        //Check for row
        for(int i=0; i<column; i++){
            rowSet = new HashSet();
            for(int j=0; j<row; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(rowSet.contains(board[i][j])){
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }
        //check for column
        for(int i=0; i<row; i++){
            columnSet = new HashSet();
            for(int j=0; j<column; j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(columnSet.contains(board[j][i])){
                    return false;
                }
                columnSet.add(board[j][i]);
            }
        }
        //check for block
        for(int i=0; i<row; i++){
            blockSet = new HashSet();
            int tempI = ((i/3)*3);
            int tempJ = ((i%3)*3);
            for(int j=0; j<column; j++){
                if(j!=0 && j%3==0){
                    tempI++;
                    tempJ = ((i%3)*3);
                }
                if(board[tempJ][tempI]=='.'){
                    tempJ++;
                    continue;
                }
                if(blockSet.contains(board[tempJ][tempI])){
                    return false;
                }
                blockSet.add(board[tempJ][tempI]);
                tempJ++;
            }
        }
        return true;

        IntStream.range(0, row).allMatch(n -> {
            blockSet = new HashSet();
            int tempI = ((i/3)*3);
            int tempJ = ((j%3)*3);
            return IntStream.range(0, column).filter(n2 -> n2)
            .allMatch(n2 -> {

            })
        })
    }*/