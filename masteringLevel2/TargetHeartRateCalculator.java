// TargetHeartRateCalculator.java
// @uthor : Manuel Medina.
// Date : nov 3rd 2017.
// class that calculate the Target-Heart-Rate-Calculator

public class TargetHeartRateCalculator
{
   public Employee person;
   public Date birtDate;
   public Date currentDate;

   public TargetHeartRateCalculator(String firstName, String lastName, int month, int day, int year, int currentMonth, int currentDay, int currentYear)
   {
      person = new Employee(firstName, lastName, 0.0);
      birtDate = new Date(month, day, year);
      currentDate = new Date(currentMonth, currentDay, currentYear);

   }


   public int calculatePersonsAge()
   {
      int age = currentDate.getYear() - birtDate.getYear();
      return age;
   }

   public int maximumHeartRate()
   {
      int maximumRate = 220 - calculatePersonsAge();
      return maximumRate;
   }

   public String targetHeartRates()
   {
         double max =  (double)maximumHeartRate();
         String target = String.format("%.0f-%.0f%n%n", max * 0.50, max * 0.85);
         return target;
   }

} // class TargetHeartRateCalculator