// StudentTest.java
// @uthor : Manuel Medina
// Date : nov 20th 2017 8:04am.
// Create and test Student objects.
public class StudentTest
{
   public static void main(String[] args)
   {
      Student account1 = new Student("Manuel Medina", 93.5);
      Student account2 = new Student("Victor Brito", 72.75);

      System.out.printf("%s's letter grade is: %s%n",
         account1.getName(), account1.getLetterGrade());

      System.out.printf("%s's letter grade is: %s%n",
         account2.getName(), account2.getLetterGrade());
   }
} // end class StudentTest