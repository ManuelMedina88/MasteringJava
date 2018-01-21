// PieceWorkerX.java
// @uthor : Manuel Medina.
// Date : Jan 19th 2018 22:15
// this class represents an employee whose pay is based on the number of pieces of merchandise produced.

public class PieceWorkerX extends EmployeeX
{
   private double wage;
   private int pieces;

   // constructor
   public PieceWorkerX(String firstName, String lastName,
                       String socialSecurityNumber, double wage, int pieces)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (wage < 0.0)
         throw new IllegalArgumentException(
            "the wage can't be negative");

      if (pieces < 0)
         throw new IllegalArgumentException(
            "the pieces can't be negative");

      this.wage = wage;
      this.pieces = pieces;
   }

   // sets wage
   public void setWage(double wage)
   {
      if (wage < 0.0)
         throw new IllegalArgumentException(
            "the wage can't be negative");

      this.wage = wage;
   }

   // gets wage
   public double getWage()
   {
      return wage;
   }

   // sets pieces
   public void setPieces(int pieces)
   {
      if (pieces < 0)
         throw new IllegalArgumentException(
            "the pieces can't be negative");

      this.pieces = pieces;
   }

   // gets pieces
   public int getPieces()
   {
      return pieces;
   }

   // calculate the earnings
   @Override
   public double earnings()
   {
      return getPieces() * getWage();
   }

   // String representation
   public String toString()
   {
      return String.format("%s: %s%n%s: $%,.2f%n%s: %d%n",
         "Piece-worker", super.toString(), "Wage",
         getWage(), "Pieces", getPieces());
   }
} // end class PieceWorkerX