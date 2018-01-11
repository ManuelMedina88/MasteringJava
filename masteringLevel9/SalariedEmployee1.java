// SalariedEmployee1.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 07:13 a.m.
// SalariedEmployee class that implements interface Payable method getPaymentAmount.
public class SalariedEmployee1 extends Employee1
{
   private double weeklySalary;

   public SalariedEmployee1(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (weeklySalary < 0.0) // validate weekSalary
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0) // validate weekSalary
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   }

   // caculate earnings; implement interface Payable method that was
   // abstract in superclass Employee
   @Override
   public double getPaymentAmount()
   {
      return getWeeklySalary();
   }

   @Override
   public String toString()
   {
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   }
} // end class SalariedEmployee