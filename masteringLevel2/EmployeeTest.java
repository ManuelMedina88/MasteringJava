// EmployeeTest.java
// @uthor : Manuel Medina.
// Date : nov 3rd 2017.
// app that demonstrates the capabilities of class Employee.

public class EmployeeTest
{
   public static void main(String[] args)
   {
      Employee employee1 = new Employee("Manuel", "Medina", 5000.0);
      Employee employee2 = new Employee("Victor", "Brito", 10000.0);

      System.out.println("\t\t\tEmployees salaries yearly");
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary: %.2f%n%n", employee1.getFirstName(),
         employee1.getLastName(), employee1.getMonthlySalary() * 12);

      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary: %.2f%n%n", employee1.getFirstName(),
         employee1.getLastName(), employee2.getMonthlySalary() * 12);

      System.out.println("\t\t\tEmployees salaries yearly plus a 10%");
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary: %.2f%n%n", employee1.getFirstName(),
         employee1.getLastName(), (employee1.getMonthlySalary() * 1.10) * 12);

      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary: %.2f%n%n", employee1.getFirstName(),
         employee1.getLastName(), (employee2.getMonthlySalary() * 1.10) * 12);
   } // end method main
} // end class EmployeeTest.