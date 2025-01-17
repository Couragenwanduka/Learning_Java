package stringReveral;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Split the string into an array of words
        String[] wordsArray = input.split("\\s+");

        // Reverse the words in the array
        for (int i = 0; i < wordsArray.length / 2; i++) {
            String temp = wordsArray[i];
            wordsArray[i] = wordsArray[wordsArray.length - 1 - i];
            wordsArray[wordsArray.length - 1 - i] = temp;
        }

        // Join the reversed array into a string
        String reversedString = String.join(" ", wordsArray);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
