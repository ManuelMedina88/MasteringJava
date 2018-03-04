// UsingExceptions2.java
// @uthor : Manuel Medina.
// Date : Jan 23th 2018 19:43 .
// stack unwinding and obtaing data from an exception object.

public class UsingExceptions2
{
   public static void main(String[] args)
   {
      try
      {
         method1();
      }
      catch (Exception exception) // catch exception throw in method1
      {
         System.err.printf("%s%n%n", exception.getMessage());
         exception.printStackTrace();

         // obtain the stack-trace information
         StackTraceElement[] traceElements = exception.getStackTrace();

         System.out.printf("%nStack trace from getStackTrace:%n");
         System.out.println("Class\t\t\tFile\t\t\tLine\tMethod");

         // loop through traceElements to get exception description
         for (StackTraceElement element : traceElements)
         {
            System.out.printf("%s\t", element.getClassName());
            System.out.printf("%s\t", element.getFileName());
            System.out.printf("%s\t", element.getLineNumber());
            System.out.printf("%s%n", element.getMethodName());

         }
      }
   } // end main

   // call method2; throw exceptions back to main
   public static void method1() throws Exception
   {
      method2();
   }

   // call method3; throw exceptions back to method1
   public static void method2() throws Exception
   {
      method3();
   }

   // throw Exception back to method2
   public static void method3() throws Exception
   {
      throw new Exception("Exception thrown in method3");
   }
} // end class UsingExceptions