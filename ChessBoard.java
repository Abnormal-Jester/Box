

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
		if (squareObject[xChoose][yChoose].openSquare) {
			squareObject[xChoose][yChoose].changeSquare(curSide);
			curSide = (curSide + 1) % 2;
		}
		else {
			System.out.println("You can't move there.");
		}
	}

	public static void squareChoose () // returns a integers that the user inputs
   {
      //Set up the scanner
      Scanner intInput = new Scanner (System.in);
      int a = -1;
		int b = -1;

      // repeat until the user inputs a positive integer
      while (b < 0 || b > 2)
      {
         if (intInput.hasNextInt())
         {
            a = intInput.nextInt();
				if (intInput.hasNextInt())
	         {
	            b = intInput.nextInt();
	         }
         }
         if (a < 0 || a > 2 || b < 0 || b > 2) // if the correct input hasn't been entered yet
         {
            System.out.print("Invalid. ");
				a = -1;
				b = -1;
            intInput.nextLine();
         }

      }

		xChoose = a;
		yChoose = b;

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

		for (int i = 1; i <= 5 ; i++) {
			System.out.print("Enter the coordinate. ");
			squareChoose();
			changeSquare();
			printBoard();
		}

		System.out.println("Thanks for Playing");
		System.exit(0);
	}
}
