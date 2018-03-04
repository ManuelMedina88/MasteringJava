// InvoiceTest.java
// @uthor : Manuel Medina.
// Date : nov 2nd 2017.
// app that demonstrates all the capabilities of class Invoice.

public class InvoiceTest
{
   public static void main(String[] args)
   {
      Invoice article1 = new Invoice("001", "Hammer", 5, 15.0 );
      Invoice article2 = new Invoice("002", "Shovel", 3, 25.0 );
      Invoice article3 = new Invoice("003", "Boot(pair)", 8, 40.0);
      Invoice article4 = new Invoice("004", "Helmet", 8, 12.65);
      Invoice article5 = new Invoice("005", "Uniform", 8, 50.30);
      Invoice article6 = new Invoice("006", "gloves", 8, 6.86);

      // print the invoice

      System.out.println("\t\tInvoice");
      System.out.println("Number\tDescription\t\tQuantity\tUnit Price\tTotal price");
      System.out.printf("%s\t%s\t\t\t%d\t\t%.2f\t\t%.2f%n", article1.getNumber(), article1.getDescription(),
         article1.getQuantity(), article1.getPrice(), article1.getInvoiceAmount());

      System.out.printf("%s\t%s\t\t\t%d\t\t%.2f\t\t%.2f%n", article2.getNumber(), article2.getDescription(),
         article2.getQuantity(), article2.getPrice(), article2.getInvoiceAmount());

      System.out.printf("%s\t%s\t\t%d\t\t%.2f\t\t%.2f%n", article3.getNumber(), article3.getDescription(),
         article3.getQuantity(), article3.getPrice(), article3.getInvoiceAmount());

      System.out.printf("%s\t%s\t\t\t%d\t\t%.2f\t\t%.2f%n", article4.getNumber(), article4.getDescription(),
         article4.getQuantity(), article4.getPrice(), article4.getInvoiceAmount());

      System.out.printf("%s\t%s\t\t\t%d\t\t%.2f\t\t%.2f%n", article5.getNumber(), article5.getDescription(),
         article5.getQuantity(), article5.getPrice(), article5.getInvoiceAmount());

      System.out.printf("%s\t%s\t\t\t%d\t\t%.2f\t\t%.2f%n", article6.getNumber(), article6.getDescription(),
         article6.getQuantity(), article6.getPrice(), article6.getInvoiceAmount());

      double total = article1.getInvoiceAmount() + article2.getInvoiceAmount() +
      article3.getInvoiceAmount() + article4.getInvoiceAmount() + article5.getInvoiceAmount() + article6.getInvoiceAmount();
      System.out.printf("\t\t\t\t\t\t\tTotal :\t%.2f%n%n", total);

   }
}