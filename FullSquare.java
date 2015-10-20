public class FullSquare extends Square {

	// ----------
	// fields
	// ----------

	final private char blankPiece = '_';
	final private char blackPiece = 'O';
	final private char whitePiece = 'X';

	private char pieceType; // 'X' 'O'
	private boolean openSquare;
	private int pieceSide;

	// ----------
	// constructors
	// ----------

	public FullSquare (int setPieceSide, int setX, int setY) {
		super (setX, setY);
		pieceSide = setPieceSide;
		changeSquare();
	}


	// ----------
	// methods
	// ----------

	@Override
	public void getSquare() {
		System.out.print(pieceType);
	}

	public void changeSquare() {

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

	public void setPieceSide (int placeHold) {
		pieceSide = placeHold;
		changeSquare();
	}

	public char getPieceType () {
		return pieceType;
	}

	public void clearPieceSide (int placeHold) {
		pieceSide = 0;
		changeSquare();
	}

	public boolean getOpenSquare () {
		return openSquare;
	}

}
