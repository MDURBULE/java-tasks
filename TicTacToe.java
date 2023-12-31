package cognifyz_level_2;

import java.util.Scanner;

public class TicTacToe {
	
	private static void printBoard(char[][] board) {
        System.out.println(" | 0 | 1 | 2 |");
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i +"|"+ " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" |" + " ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }

    private boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private boolean isWinner(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }



	public static void main(String[] args) {
		TicTacToe tt = new TicTacToe();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a first player name : -");
		String player1 = scan.nextLine();
		System.out.print("Enter a second player name : -");
		String player2 = scan.nextLine();

		char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        int rounds = 1;

        while (true) {
            System.out.println("Round " + rounds);
            printBoard(board);

            char currentPlayer = ((rounds-1) % 2 == 0) ? 'O' : 'X';
            
            if(currentPlayer=='O') {
            	 System.out.print("Player " + player1 + "(O), enter your move (row and column):");
            }
            else if(currentPlayer=='X') {
           	 System.out.print("Player " + player2 + "(X), enter your move (row and column):");

            }
       
            int row = scan.nextInt();
            int col = scan.nextInt();

            
            if (tt.isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;

                if (tt.isWinner(board, currentPlayer)) {
                    printBoard(board);
                    if(currentPlayer=='O') {
                    	 System.out.println(player1 +" wins!");
                   }
                   else if(currentPlayer=='X') {
                	   System.out.println(player2 + " wins!");

                   }
           
                    break;
                } else if (tt.isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    break;
                }

                rounds++;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scan.close();

	}

}
