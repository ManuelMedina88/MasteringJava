// TargetHeartRateCalculatorTest.java
// @uthor : Manuel Medina.
// Date : Nov 3rd 2017.
// app that demonstrates the class TargetHeartRateCalculator's capabitities.
import javax.swing.JOptionPane;

public class TargetHeartRateCalculatorTest
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(null,"Target Heart Rate Calculator");
      String firstName = JOptionPane.showInputDialog("What is your first name? ");
      String secondName = JOptionPane.showInputDialog("What is your last name? ");
      int month = Integer.parseInt(JOptionPane.showInputDialog("What is your birth month? "));
      int day = Integer.parseInt(JOptionPane.showInputDialog("What is your birth day? "));
      int year = Integer.parseInt(JOptionPane.showInputDialog("What is your birth year? "));
      int currentMonth = Integer.parseInt(JOptionPane.showInputDialog("What is the current month? "));
      int currentDay = Integer.parseInt(JOptionPane.showInputDialog("What is the current day? "));
      int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What is the current year? "));

      TargetHeartRateCalculator person = new TargetHeartRateCalculator(firstName, secondName,
         month, day, year, currentMonth, currentDay, currentYear);

      String message = String.format("%s%n%s%s%n%s%s%n%s%s%n%s%d%n%s%d%n%s%s%n","Target Heart Rate Calculator", "First Name: ", person.person.getFirstName(),
         "Last Name: ", person.person.getLastName(),"Birthday: ", person.birtDate.displayDate(),
         "Age: ", person.calculatePersonsAge(), "Maximum Heart Rate: ", person.maximumHeartRate(),
         "Target Heart Rate : ", person.targetHeartRates());

      JOptionPane.showMessageDialog(null, message);
   }
}