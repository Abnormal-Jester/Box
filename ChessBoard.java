public class ChessBoard {
	// ----------
	// fields
	// ----------


	// ----------
	// constructors
	// ----------


	// ----------
	// methods
	// ----------

	public static void swapSquares () {

	}


	// ----------
	// main
	// ----------

	public static void main(String[] args) {
		final int boardWidth = 3;
		final int boardHeight = boardWidth;

		// setting up the ChessBoard
		FullSquare[][] squareObject = new FullSquare[boardHeight][boardWidth];

		for (int i = 0; i <= boardHeight-1; i++) {
			for (int j = boardWidth-1; j >= 0; j--) {
				squareObject[i][j] = new FullSquare(-1, i, j);
			}
		}

		/*

		i, j
		(0, 2) (1, 2) (2, 2)
		(0, 1) (1, 1) (2, 1)
		(0, 0) (1, 0) (2, 0)

		*/

		// side line and
		for (int i = 0; i <= squareObject.length-1; i++) {
			System.out.print("||");
			for (int j = 0; j <= squareObject[0].length-1; j++) {
				System.out.print(' ');
				squareObject[i][j].getSquare();
			}
			System.out.println();
		}

		// bottom line
		System.out.print("  ");
		for (int i = 0; i <= squareObject[0].length-1; i++) {
			System.out.print("==");
		}
		System.out.print("=");

		System.out.println();


	}
}
