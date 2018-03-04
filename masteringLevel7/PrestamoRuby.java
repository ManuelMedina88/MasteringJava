// PrestamoRuby.java
// @uthor : Manuel Medina.
// Date : Jan 3rd 2018
// app that calculates the interest and the capital and the
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class PrestamoRuby
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double interesAcumulado = 0.0;
      double capitalAcumulado = 0;

      System.out.print("Digite la cantidad de dinero a solicitar para el prestamo : ");
      double capital = scan.nextDouble();

      System.out.print("Digite el interes a plazo fijo : ");
      double interes = scan.nextDouble()/100;

      System.out.print("Digite el numero de meses de plazo a pagar : ");
      int months = scan.nextInt();

      //BigDecimal c = (rate.multiply(requestQuantity)).divide(BigDecimal.ONE.subtract((BigDecimal.ONE.divide(BigDecimal.ONE.add(rate))).pow(numberOfMonth)));
      double result = (interes * capital)/(1 - (Math.pow((1/ (1 + interes)), months)));
      System.out.printf("%.2f%n%n", result);
      System.out.printf("%-4s%-15s%-15s%-16s%-16s %-14s%n","Mes","Saldo","Amortizacion","Interes","Cuota","Saldo Final");
      for(int i = 1; i <= months; i++) {
         System.out.printf("%-4d%-15s%-15s%-16s%-16s %-14s%n", i, NumberFormat.getCurrencyInstance().format(capital),
            NumberFormat.getCurrencyInstance().format(result - (capital * interes)),
            NumberFormat.getCurrencyInstance().format(capital * interes),
            NumberFormat.getCurrencyInstance().format(result),
            NumberFormat.getCurrencyInstance().format(capital - (result - (capital * interes))));

         interesAcumulado += capital * interes;
         //System.out.println(interesAcumulado);
         capitalAcumulado += result - (capital * interes);
         //System.out.println(capitalAcumulado);
         capital = capital - (result - (capital * interes));
      }

      System.out.printf("%n%n%n%-19s%-15s%-15s%n", "Total", NumberFormat.getCurrencyInstance().format(capitalAcumulado), NumberFormat.getCurrencyInstance().format(interesAcumulado));
      //System.out.printf("Interes : %s%n", NumberFormat.getCurrencyInstance().format(interesAcumulado) );
     // System.out.printf("Capital : %s%n", NumberFormat.getCurrencyInstance().format(capitalAcumulado));

   }
}