import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {
    private char[][] board;
    
    public SudokuBoard(String fileName) throws FileNotFoundException {
        board = new char[9][9];
        
        Scanner input = new Scanner(new File(fileName));
        
        for(int row = 0; row < board.length; row++) {
           String line = input.next();
           
           for(int col = 0; col < board[row].length; col++) {
              char value = line.charAt(col);
              
              if(value == '.') {
                board[row][col] = ' ';
              }else {
                   board[row][col] = value;
              }
              
           }
        }
        input.close();
    }
    
    public String toString() {
       String result = "";
       
       for(int row = 0; row < board.length; row++) {
          for(int col = 0; col < board[row].length; col++) {
             result += board[row][col] + " ";
             
             if(col == 2 || col == 5) {
                result += "| ";
             }
          }
          result += "\n";
          
          if(row == 2 || row == 5) {
             result += "------+-------+------\n";
          }
       }
       return result;
    }
}