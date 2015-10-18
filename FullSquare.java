public class FullSquare extends Square {
	
	// ----------
	// fields
	// ----------

	char pieceType; // 'X' 'O'
	final int pieceSide;

	// ----------
	// constructors
	// ----------

	public FullSquare (int setPieceSide, int setX, int setY) {
		super (setX, setY);
		pieceSide = setPieceSide;

		if (pieceSide == 0) {
			pieceType = 'X';
		}
		else if (pieceSide == 0) {
			pieceType = 'O';
		}
		else {
			pieceType = ' ';
		}
	}


	// ----------
	// methods
	// ----------

	public void printMethod() {
		super.printMethod();
		System.out.println("printed in FullSquare");
	}

}