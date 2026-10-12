import java.io.FileNotFoundException;

public class SudokuMain {
     public static void main(String[] args) throws FileNotFoundException {
           SudokuBoard board = new SudokuBoard("data1.sdk");
           System.out.println(board);
     }
}