public class ChessBoard extends Square{
   // ----------
   // fields
   // ----------
   
   
   // ----------
   // constructors
   // ----------
   
   
   // ----------
   // methods
   // ----------
   
   
   // overrides printMethod in Superclass
   public void printMethod() {
       super.printMethod();
       System.out.println("Printed in Subclass");
   }
   
   
   // main
   public static void main(String[] args) {
       ChessBoard s = new ChessBoard();
       s.printMethod();    
   }
   
}