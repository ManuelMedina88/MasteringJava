// DateTest.java
// @uthor : Manuel Medina.
// Date : nov 3rd 2017.
// app that desmonstrate all the capabilities of class Date
import javax.swing.JOptionPane;

public class DateTest
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(null, "We're going to ask your birthday");
      int month = Integer.parseInt(JOptionPane.showInputDialog("What is your birth month?"));
      int day = Integer.parseInt(JOptionPane.showInputDialog("What is your birth day?"));
      int year = Integer.parseInt(JOptionPane.showInputDialog("What is your birth year?"));

      Date birthDate = new Date(month, day, year);

      JOptionPane.showMessageDialog(null, "We're going to ask the current date");
      int currentMonth = Integer.parseInt(JOptionPane.showInputDialog("Which month is this?"));
      int currentDay = Integer.parseInt(JOptionPane.showInputDialog("What day is today?"));
      int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What year is this?"));

      Date currentDate = new Date(currentMonth, currentDay, currentYear);

      String playing = String.format("Birth Date : %s%nCurrent Date : %s%nYour are approximately %d years old%n%n",
         birthDate.displayDate(), currentDate.displayDate(), (currentDate.getYear() - birthDate.getYear()));
      JOptionPane.showMessageDialog(null, playing);
   }
}