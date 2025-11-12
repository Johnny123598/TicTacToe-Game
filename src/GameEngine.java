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

