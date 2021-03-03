//problem link :: https://www.hackerrank.com/challenges/java-currency-formatter/problem"
import java.util.Scanner;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;

public class currency {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);//in this line we have to construct the currency for INDIA.
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);           //Checkout this link for constructing non existing currency format 
                                                                                               //https://stackoverflow.com/questions/2544454/get-the-currency-format-for-a-country-that-does-not-have-a-locale-constant
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);



    System.out.println("US: "+ us);
    System.out.println("India: "+ india);
    System.out.println("China: "+ china);
    System.out.println("France: "+ france);
    
  }

  
}
