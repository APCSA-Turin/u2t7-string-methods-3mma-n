package Lab1;
import java.util.Scanner;

public class Lab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String wordOne = sc.nextLine();
        System.out.print("Enter Another Word: ");
        String wordTwo = sc.nextLine();

        if (wordOne.length() > wordTwo.length()) {
            System.out.println(wordOne + " is longer.");
        }
        else if (wordOne.length() < wordTwo.length()) {
            System.out.println(wordTwo + " is longer.");
        }
        else {
            System.out.println("The two words are the same length.");
        }

        int middleIndex = (int) (wordOne.length() / 2);
        System.out.println("First Half: " + wordOne.substring(0, middleIndex));
        System.out.println("Second Half: " + wordOne.substring(middleIndex));
        middleIndex = (int) (wordTwo.length() / 2);
        System.out.println("First Half: " + wordTwo.substring(0, middleIndex));
        System.out.println("Second Half: " + wordTwo.substring(middleIndex));

        int foundIndex = wordOne.indexOf(wordTwo);
        if (foundIndex == -1) {
            System.out.println(wordTwo + " is NOT found in " + wordOne);
        }
        else {
            System.out.println(wordTwo + " is found in " + wordOne + " at index " + foundIndex);
        }
        sc.close();
    }
}
