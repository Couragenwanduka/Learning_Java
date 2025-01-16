package currency;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {

      //Convertion Rate   
      double usdToEur = 0.08;
      double usdToJpy = 110.5;
      double usdToGbp = 1.0;
      double eurToUsd = 1.18;
      double eurToGbp = 0.88;
      double gbpToUsd = 1.33;
      double gbpToEur = 1.14;

      // Currency Conversion Function
      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the Currency Conversion");
      System.out.println("Enter the amount:");
      double amount = scanner.nextDouble();

      System.out.println("Enter the source currency (USD, EUR, GBP): ");
      String sourceCurrency = scanner.next().toUpperCase();

      System.out.println("Enter the target currency (USD, EUR, GBP): ");
      String targetCurrency = scanner.next().toUpperCase();

      double convertedAmount = 0;
      boolean validConversion = true;

      if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")){
          convertedAmount = amount * usdToEur;
      }else if(sourceCurrency.equals("USD") && targetCurrency.equals("JPY")){
          convertedAmount = amount * usdToJpy;
      }else if(sourceCurrency.equals("USD") && targetCurrency.equals("GBP")){
        convertedAmount = amount * usdToGbp;
      }else if(sourceCurrency.equals("EUR") && targetCurrency.equals("USD")){
        convertedAmount = amount * eurToUsd;
      }else if(sourceCurrency.equals("EUR") && targetCurrency.equals("GBP")){
        convertedAmount = amount * eurToGbp;
      }else if(sourceCurrency.equals("GBP") && targetCurrency.equals("USD")){
        convertedAmount = amount * gbpToUsd;
      }else if(sourceCurrency.equals("GBP") && targetCurrency.equals("EUR")){
        convertedAmount = amount * gbpToEur;
      }else if(sourceCurrency.equals(targetCurrency)){
        convertedAmount = amount;
      }else {
        System.out.println("Invalid Conversion. Please choose different currencies.");
        validConversion = false;
      }

      if(validConversion){
        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
      }

      scanner.close();

      }
    
}
