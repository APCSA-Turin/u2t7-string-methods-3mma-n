package Lab2;
import java.util.Scanner;

public class Lab2Main {

   public static int compareWords(String str1, String str2) {
      if (str1.equals(str2)) {
         System.out.print("-10 points: new word and previous word are the same.");
         return -10;
      }
      else if (str1.compareTo(str2) < 0){
         System.out.print("+2 points: new word is after previous word alphabetically.");
         return 2;
      }
      else {
         System.out.print("-5 points: new word is before previous word alphabetically.");
         return -5;
      }
   }

   public static int lastFirstMatch(String str1, String str2) {
      if (str1.substring(str1.length() - 2).equals(str2.substring(0, 2))) {
         System.out.print("+5 points: last two letters of previous word match first two letters of new word.");
         return 5;
      }
      else {
         return 0;
      }
   }

   public static int firstAnyMatch(String str1, String str2) {
      if (str2.indexOf(str1.substring(0, 1)) != -1) {
      System.out.print("+3 points: first letter of previous word is also in new word.");
         return 3;
      }
      else {
         return 0;
      }
   }
   public static int sameLength(String str1, String str2) {
      if (str1.length() == str2.length()) {
      System.out.print("+3 points: previous word and new word are the same length");
         return 3;
      }
      else {
         return 0;
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pointChange;
      int score = 0;
      int wordsUsed = 1;
      System.out.print("Enter starting word: ");
      String oldWord = sc.nextLine();
      
      while (score < 50) {
         System.out.print("Enter new word: ");
         String newWord = sc.nextLine();

         pointChange = compareWords(oldWord, newWord);
         score += pointChange;
         System.out.println(" Score: " + score);

         pointChange = lastFirstMatch(oldWord, newWord);
         if (pointChange != 0) {
            score += pointChange;
            System.out.println(" Score: " + score);
         }

         pointChange = firstAnyMatch(oldWord, newWord);
         if (pointChange != 0) {
            score += pointChange;
            System.out.println(" Score: " + score);
         }
         pointChange = sameLength(oldWord, newWord);
         if (pointChange != 0) {
            score += pointChange;
            System.out.println(" Score: " + score);
         }

         oldWord = newWord;
         wordsUsed += 1;
      }
      System.out.println("Congrats! You've reached 50 points in " + wordsUsed + " words!");
      sc.close();
   }
}
