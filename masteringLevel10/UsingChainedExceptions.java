// UsingChainedExceptions.java
// @uthor : Manuel Medina.
// Date : Jan 23th 2018 20:17
// Chained exceptions.

public class UsingChainedExceptions
{
   public static void main(String[] args)
   {
      try
      {
         method1();
      }
      catch(Exception exception) // exceptions thrown from method1
      {
         exception.printStackTrace();
      }
   }

   // call method2; throw exceptions back to main
   public static void method1() throws Exception
   {
      try
      {
         method2();
      }
      catch(Exception exception)
      {
         throw new Exception("Exception thrown in method1", exception);
      }
   }

   // call method3; throw exceptions back to method1
   public static void method2() throws Exception
   {
      try
      {
         method3();
      }
      catch (Exception exception) // exception throw from method3
      {
         throw new Exception("Exception thrown in method2", exception);
      }
   }

   public static void method3() throws Exception
   {
      throw new Exception("Exception thrown in method3");
   }
} // end class UsingChainedExceptions