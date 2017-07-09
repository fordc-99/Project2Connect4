
public class Board {
	
	private static final int SIZE = 3;
	private String[][] board;
	
	public Board() {
		board = new String[SIZE][SIZE];
	}
	
	public boolean playMove(String pos, int col) {
		for (int x=SIZE-1; x>=0; x--) {
			if (board[x][col] == null) {
				board[x][col] = pos;
				return true;
			}
		}
		return false;
	}
	
	public boolean isWinner(String pos) {
		String toCheck = pos + pos + pos;
		//check horizontal, vertical, forward diagonal, backward diagonal
		for (int i=0; i<SIZE; i++) {
			String horizontal = "";
			String vertical = "";
			String fdiagonal = "";
			String bdiagonal = "";
			for (int j=0; j<SIZE; j++) {
				horizontal += board[i][j];
				vertical += board[j][i];
				fdiagonal += board[j][j];
				bdiagonal += board[SIZE-1-j][j];
			}
			if (horizontal.equals(toCheck) ||
				vertical.equals(toCheck) ||
				fdiagonal.equals(toCheck) ||
				bdiagonal.equals(toCheck)) return true;
		}
		return false;
	}
	
	public boolean isFull(int col) {
		for (int x=0; x<SIZE; x++) {
			if (board[x][col] == null)
				return false;
		}
		return true;
	}
	
	public boolean isFull() {
		for (int x=0; x<SIZE; x++) {
			for (int j=0; j<SIZE; j++) {
				if (board[x][j] == null)
					return false;
			}
		}
		return true;
	}
	
	public void printBoard() {
		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				if (board[i][j] == null) {
					System.out.print(" - ");
				} else {
					System.out.print(" " + board[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
}
