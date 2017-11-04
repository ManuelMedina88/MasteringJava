// HealthProfileTest.java
// @uthor : Manuel Medina.
// Date nov 4th 2017.
// app that show the capabilities of HealthProfileClass
import javax.swing.JOptionPane;

public class HealthProfileTest
{
   public static void main(String[] args)
   {

      JOptionPane.showMessageDialog(null,"Health Profile record");
      String firstName = JOptionPane.showInputDialog("What is your first name? ");
      String lastName = JOptionPane.showInputDialog("What is your last name? ");
      String gender = JOptionPane.showInputDialog("gender: ");
      int month = Integer.parseInt(JOptionPane.showInputDialog("What is your birth month? "));
      int day = Integer.parseInt(JOptionPane.showInputDialog("What is your birth day? "));
      int year = Integer.parseInt(JOptionPane.showInputDialog("What is your birth year? "));
      double height = Double.parseDouble(JOptionPane.showInputDialog("height in inches: "));
      double weight = Double.parseDouble(JOptionPane.showInputDialog("weight in pounds: "));
      int currentMonth = Integer.parseInt(JOptionPane.showInputDialog("What is the current month? "));
      int currentDay = Integer.parseInt(JOptionPane.showInputDialog("What is the current day? "));
      int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What is the current year? "));

      HealthProfile person = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight,
         currentMonth, currentDay, currentYear);

      String message = String.format("%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%d%n%s%d%n%s%s%n%s%n%n","Target Heart Rate Calculator", "First Name: ", person.person.person.getFirstName(),
         "Last Name: ", person.person.person.getLastName(), "Gender: ", person.getGender(),"Birthday: ", person.person.birtDate.displayDate(),
         "Age: ", person.person.calculatePersonsAge(), "Maximum Heart Rate: ", person.person.maximumHeartRate(),
         "Target Heart Rate : ", person.person.targetHeartRates(), person.displayBodyMassIndex());

      JOptionPane.showMessageDialog(null, message);
   }
}