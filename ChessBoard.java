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


	// ----------
	// main
	// ----------

	public static void main(String[] args) {

		// setting up the ChessBoard
		FullSquare[][] squareObject = new FullSquare[3][3];

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				squareObject[i][j] = new FullSquare(-1, i, j);
			}
		}

		/*

		i, j
		(0, 0) (1, 0) (2, 0)
		(0, 1) (1, 1) (2, 1)
		(0, 2) (1, 2) (2, 2)

		*/

		squareObject[0][1].printSquare();

	}
}
