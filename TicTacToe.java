public class TicTacToe {
    public static void main(String[] args) {
        char [][] tictactoeBoard ={{'X','O','X'} , {'O', 'X', 'O'} , {'X','O', 'X'} };
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.printTicTacToe(tictactoeBoard);
    }
    public void printTicTacToe(char[][] tictactoeBoard)
    {
        for(int i=0;i<tictactoeBoard.length;i++){
            for (int j=0;j< tictactoeBoard[i].length;j++){
                System.out.print(tictactoeBoard[i][j]  + " ");
            }
            System.out.println();
        }
    }
}
