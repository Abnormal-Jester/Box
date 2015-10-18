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

	public void printMethod() {
		System.out.println("Printed in Square.");
		System.out.println(xSquare + ", " + ySquare);
	}

}