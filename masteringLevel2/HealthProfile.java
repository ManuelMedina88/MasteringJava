// HealthProfile.java
// @uthor : Manuel Medina.
// Date : Nov. 4th 2017.
// this class support the record for a computerization of health records.

public class HealthProfile
{

      public TargetHeartRateCalculator person;
      private String gender;
      private double height;
      private double weight;

      public HealthProfile(String firstName, String secondName, String gender, int month, int day, int year,
                           double height, double weight, int currentMonth, int currentDay, int currentYear)
      {
         person = new TargetHeartRateCalculator(firstName, secondName,
            month, day, year, currentMonth, currentDay, currentYear);

         this.gender = gender;

         if(height > 0.0)
            this.height = height;

         if(weight > 0.0)
            this.weight = weight;
      }

      public void setGender(String gender)
      {
         this.gender = gender;
      }

      public String getGender()
      {
         return gender;
      }

      public void setHeight(int height)
      {
         if(height > 0.0)
            this.height = height;
      }

      public double getHeight()
      {
         return height;
      }

      public void setWeight(double weight)
      {
         if(weight > 0.0)
            this.weight = weight;
      }

      public double getWeight()
      {
         return weight;
      }

      public String displayBodyMassIndex()
      {
         // calculates and show the procesed information of the BMI
          String bodyMassIndex = String.format("Your body mass index is %.1f%n", (getWeight() * 703)/(getHeight() * getHeight()));

         // show the informacion provided by the
         String info = String.format("%n%s%n%s%n%s%n%s%n%s%n", "BMI VALUES", "Underweight:\tless than 18.5",
            "Normal:\t\tbetween 18.5 and 24.9", "Overweight:\tbetween 25 and 29.9", "Obese:\t\t30 or greater");

         return bodyMassIndex + info;
      }

}