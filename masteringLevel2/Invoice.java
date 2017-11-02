// Invoice.java
// @uthor : Manuel Medina.
// Date : nov 2nd 2017.
// app that simulates and hardware store invoice.

public class Invoice
{
   String number;
   String description;
   int quantity;
   double price;

   public Invoice(String number, String description, int quantity, double price)
   {
      this.number = number;
      this.description = description;
      this.quantity = quantity;
      this.price = price;
   }

   public void setNumber(String number)
   {
      this.number = number;
   }

   public String getNumber()
   {
      return number;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public String getDescription()
   {
      return description;
   }

   public void setQuantity(int quantity)
   {
      if (quantity > 0)
         this.quantity = quantity;
   }

   public int getQuantity()
   {
      return quantity;
   }

   public void setPrice(double price)
   {
      if(price > 0.0)
         this.price = price;
   }

   public double getPrice()
   {
      return price;
   }

   public double getInvoiceAmount()
   {
      double amount = quantity * price;

      return  amount;
   }
}