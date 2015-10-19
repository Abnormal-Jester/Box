

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
	static int xMove = 0;
	static int yMove = 0;

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
		// side line and all square
		for (int j = squareObject.length-1; j >= 0; j--) {
			System.out.print((char) ('a' + j));
			System.out.print(" ||");
			for (int i = 0; i <= squareObject[0].length-1; i++) {
				System.out.print(' ');
				squareObject[i][j].getSquare();
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
		squareObject[xChoose][yChoose].changeSquare(curSide);
		curSide = (curSide + 1) % 2;
	}


	// temp
	public static int intCheck () // returns a integers that the user inputs
   {
      //Set up the scanner
      Scanner intInput = new Scanner (System.in);
      int a = -1;

      System.out.print("Enter an integer: ");

      // repeat until the user inputs a positive integer
      while (a < 0 || a > 2)
      {
         if (intInput.hasNextInt())
         {
            a = intInput.nextInt();
         }
         if (a < 0 || a > 2) // if the correct input hasn't been entered yet
         {
            System.out.print("Invalid. ");
            intInput.nextLine();
         }

      }

      return a;

   } // intCheck

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

		for (int i = 1; i <= 9 ; i++) {
			System.out.print("Enter the x coordinate. ");
			xChoose = intCheck();
			System.out.print("Enter the y coordinate. ");
			yChoose = intCheck();
			changeSquare();
			printBoard();
		}

	}
}
