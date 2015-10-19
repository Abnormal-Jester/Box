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

	// Method printBoard

	/*

	(0, 2) (1, 2) (2, 2)
	(0, 1) (1, 1) (2, 1)
	(0, 0) (1, 0) (2, 0)

	square[0][2] square[1][2] square[2][2]
	square[0][1] square[1][1] square[2][1]
	square[0][0] square[1][0] square[2][0]

	*/

	public static void printBoard (FullSquare[][] printObjectA) {
		// side line and all square
		for (int j = printObjectA.length-1; j >= 0; j--) {
			System.out.print((char) ('a' + j));
			System.out.print(" ||");
			for (int i = 0; i <= printObjectA[0].length-1; i++) {
				System.out.print(' ');
				printObjectA[i][j].getSquare();
			}
			System.out.println();
		}

		// bottom line
		System.out.print("    ");
		for (int i = 0; i <= printObjectA[0].length-1; i++) {
			System.out.print("==");
		}
		System.out.print('=');
		System.out.println();

		// bottom label
		System.out.print("    ");
		for (int i = 0; i <= printObjectA[0].length-1; i++) {
			System.out.print(' ');
			System.out.print(i + 1);
		}
		System.out.println();
	}


	// ----------
	// main
	// ----------

	public static void main(String[] args) {
		final int boardWidth = 3;
		final int boardHeight = boardWidth;

		// setting up the ChessBoard
		FullSquare[][] squareObject = new FullSquare[boardHeight][boardWidth];

		for (int j = 0; j <= boardHeight-1; j++) {
			for (int i = 0; i <= boardWidth-1; i++) {
				squareObject[i][j] = new FullSquare(-1, i, j);
			}
		}

		printBoard(squareObject);

	}
}
