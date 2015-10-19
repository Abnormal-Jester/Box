public class FullSquare extends Square {

	// ----------
	// fields
	// ----------

	final char blankPiece = '_';
	final char blackPiece = 'O';
	final char whitePiece = 'X';
	char pieceType; // 'X' 'O'
	boolean openSquare;
	int pieceSide;

	// ----------
	// constructors
	// ----------

	public FullSquare (int setPieceSide, int setX, int setY) {
		super (setX, setY);
		pieceSide = setPieceSide;

		if (pieceSide == -1) {
			pieceType = blankPiece;
		}
		else if (pieceSide == 0) {
			pieceType = whitePiece;
		}
		else if (pieceSide == 0) {
			pieceType = blackPiece;
		}
		changeSquare(setPieceSide);
	}


	// ----------
	// methods
	// ----------

	@Override
	public void getSquare() {
		System.out.print(pieceType);
	}

<<<<<<< HEAD
=======
	public void changeSquare(int setPieceSide) {
		pieceSide = setPieceSide;

		if (pieceSide == -1) {
			pieceType = blankPiece;
			openSquare = true;
		}
		else {
			openSquare = false;

			if (pieceSide == 0) {
				pieceType = blackPiece;
			}
			else if (pieceSide == 1) {
				pieceType = whitePiece;
			}
		}
	}
>>>>>>> origin/master
}
