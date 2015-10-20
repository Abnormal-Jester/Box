

import java.util.Scanner;

public class ChessBoard {
	// ----------
	// fields
	// ----------

	// setting up the ChessBoard
	final static int boardWidth = 3;
	final static int boardHeight = boardWidth;

	static FullSquare[][] squareObject = new FullSquare[boardHeight][boardWidth];

	// saved positions
	static int xChoose = 0;
	static int yChoose = 0;
	//static int xMove = 0;
	//static int yMove = 0;

	static int curSide = 1;


	// ----------
	// constructors
	// ----------


	// ----------
	// methods
	// ----------

	// method printBoard

	/*

	(0, 2) (1, 2) (2, 2)
	(0, 1) (1, 1) (2, 1)
	(0, 0) (1, 0) (2, 0)

	square[0][2] square[1][2] square[2][2]
	square[0][1] square[1][1] square[2][1]
	square[0][0] square[1][0] square[2][0]

	*/

	public static void printBoard () {
		char squareHold;
		// side line and all square
		for (int j = squareObject.length-1; j >= 0; j--) {
			System.out.print((char) ('a' + j));
			System.out.print(" ||");
			for (int i = 0; i <= squareObject[j].length-1; i++) {
				System.out.print(' ');
				squareHold = squareObject[i][j].getPieceType();
				System.out.print(squareHold);
			}
			System.out.println();
		}

		// bottom line
		System.out.print("    ");
		for (int i = 0; i <= squareObject[0].length-1; i++) {
			System.out.print("==");
		}
		System.out.print('=');
		System.out.println();

		// bottom label
		System.out.print("    ");
		for (int i = 0; i <= squareObject[0].length-1; i++) {
			System.out.print(' ');
			System.out.print(i + 1);
		}
		System.out.println();
	}

	public static void changeSquare () {
		if (squareObject[xChoose][yChoose].getOpenSquare()) {
			squareObject[xChoose][yChoose].setPieceSide(curSide);
			curSide = (curSide + 1) % 2;
		}
		else {
			System.out.println("You can't move there.");
		}
	}

	public static void checkWin () {
		boolean getWinCondition = false;
		char charWinCondition = ' ';
		int tieCheck = 0;

		for (int i = 0; i <= 2; i++) {
			if (!squareObject[i][0].getOpenSquare() && (squareObject[i][0].getPieceType() == squareObject[i][1].getPieceType())
																 && (squareObject[i][1].getPieceType() == squareObject[i][2].getPieceType()) ) {
				getWinCondition = true;
				charWinCondition = squareObject[i][0].getPieceType();
			}
			if (!squareObject[0][i].getOpenSquare() && (squareObject[0][i].getPieceType() == squareObject[1][i].getPieceType())
																 && (squareObject[1][i].getPieceType() == squareObject[2][i].getPieceType()) ) {
				getWinCondition = true;
				charWinCondition = squareObject[0][i].getPieceType();
			}
		}
		if (!squareObject[1][1].getOpenSquare() && (squareObject[0][0].getPieceType() == squareObject[1][1].getPieceType())
															 && (squareObject[1][1].getPieceType() == squareObject[2][2].getPieceType()) ) {
			getWinCondition = true;
			charWinCondition = squareObject[1][1].getPieceType();
		}
		if (!squareObject[1][1].getOpenSquare() && (squareObject[2][0].getPieceType() == squareObject[1][1].getPieceType())
															 && (squareObject[1][1].getPieceType() == squareObject[0][2].getPieceType()) ) {
			getWinCondition = true;
			charWinCondition = squareObject[1][1].getPieceType();
		}
		if (getWinCondition) {
			System.out.println(charWinCondition + " has won!");
			System.out.println("Thanks for Playing");
			System.exit(0);
		}

		for (int j = 0; j <= squareObject.length-1; j++) {
			for (int i = 0; i <= squareObject[j].length-1; i++) {
				if (!squareObject[i][j].getOpenSquare()) {
					tieCheck++;
				}
			}
		}
		if (tieCheck >= 9) {
			System.out.println("The game is a tie.");
			System.out.println("Thanks for Playing");
			System.exit(0);
		}
	}

	public static void squareChoose () {
      Scanner inScanner = new Scanner (System.in);

      String finalOut = inScanner.next().toLowerCase();
      boolean cont = true;

      while (cont == true) {
         // somehow the user inputs a blank input

         if (finalOut.length() == 0 || finalOut == null) {
            System.out.print("How the heck did you do that!? ");
         }

         // universal inputs

         // exit
         else if (finalOut.equals("exit")) {
				System.out.println("Thanks for Playing");
            System.exit(0);
            cont = false;
         }

			else if (finalOut.length() >= 2) {
				xChoose = Character.getNumericValue(finalOut.charAt(1))-1;
				yChoose = Character.getNumericValue(finalOut.charAt(0))-10;
				if ((xChoose >= 0 && xChoose <= 2) && (yChoose >= 0 && yChoose <= 2)) {
					cont = false;
				}
			}

			if (cont) {
				finalOut = inScanner.nextLine();
            System.out.print("Invalid. ");
            finalOut = inScanner.next();
			}
		}

	}

	// ----------
	// main
	// ----------

	public static void main(String[] args) {

		for (int j = 0; j <= boardHeight-1; j++) {
			for (int i = 0; i <= boardWidth-1; i++) {
				squareObject[i][j] = new FullSquare(-1, i, j);
			}
		}

		printBoard();

		System.out.println("Welcome to Jarett's Tic-Tac-Toe.");
		System.out.println("Type \"exit\" to end the program at any time.");
		System.out.println("The format of a square is letter then number - (a2).");
		System.out.println("Have fun!");

		while	(true) {
			System.out.print("Enter a square: ");
			squareChoose();
			changeSquare();
			printBoard();
			checkWin();
		}
	}
}
