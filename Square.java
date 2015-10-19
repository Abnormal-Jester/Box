public class Square {

	// ----------
	// fields
	// ----------

	final int xSquare;
	final int ySquare;

	// ----------
	// constructors
	// ----------

	public Square (int setX, int setY) {
		xSquare = setX;
		ySquare = setY;
	}


	// ----------
	// methods
	// ----------

	public void printSquare() {
		System.out.print("(" + xSquare + ", " + ySquare + ")");
	}

}
