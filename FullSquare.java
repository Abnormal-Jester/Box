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
	}


	// ----------
	// methods
	// ----------

	public void printMethod() {
		super.printMethod();
		System.out.println("printed in FullSquare");
	}

}
