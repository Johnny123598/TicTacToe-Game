public class GameEngine {
    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    public GameEngine() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
}

 public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) return false;
        if (board[row][col] != '-') return false;
        board[row][col] = currentPlayer;
        return true;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
   public void displayBoard() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
