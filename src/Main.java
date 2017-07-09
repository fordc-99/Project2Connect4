
public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.playMove("x", 0);
		board.playMove("O", 1);
		board.playMove("X", 1);
		board.playMove("X", 2);
		board.playMove("X", 2);
		board.playMove("X", 2);
		
		board.printBoard();
		
		System.out.println(board.isWinner("X"));
	}
}
