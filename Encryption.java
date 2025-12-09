import java.util.*;
public class Encryption
{
   // shoham's part

        public static void main(String[] args){
           Scanner reader = new Scanner(System.in);
        
            System.out.println("Welcome to the Encryption / Decryption Program");
            System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
            int choice = reader.nextInt();
            if (choice != 1 && choice != 2){
            System.out.println(choice +" is not a valid choice");
            return;}
            if (choice == 1){

            }
    
        public static int countWords (String sentence) 
        { // Shoham בדיקת מספר מילים
            int orgLength = sentence.length();
            String noSpaces = sentence.replace(" ", "");
            int newLength = noSpaces.length();
            int numWords = orgLength - newLength + 1;
            return numWords;
        }
        public static String shiftWordsRight(String sentence, int numWords) 
        { // Shoham הזזת מילים ימינה

            if (numWords == 1) {
            return sentence;
            }

            int firstSpace = sentence.indexOf(" ");
            int lastSpace = sentence.lastIndexOf(" ");

            if (numWords == 2) {
            String word1 = sentence.substring(0, firstSpace);
            String word2 = sentence.substring(firstSpace + 1);
            return word2 + " " + word1;
            }
            if (numWords == 3) {
            String word1 = sentence.substring(0, firstSpace);
            String word2 = sentence.substring(firstSpace + 1, lastSpace);
            String word3 = sentence.substring(lastSpace + 1);
            return word3 + " " + word1 + " " + word2;
            }
            return sentence;
        }
        public static String shiftWordsLeft(String sentence, int numWords) 
        { // Shoham הזזת מילים שמאלה

            if (numWords == 1) {
            return sentence;
            }

            int firstSpace = sentence.indexOf(" ");
            int lastSpace = sentence.lastIndexOf(" ");

            if (numWords == 2) {
    
            String word1 = sentence.substring(0, firstSpace);
            String word2 = sentence.substring(firstSpace + 1);
            return word2 + " " + word1;
            }

            if (numWords == 3) {

            String word1 = sentence.substring(0, firstSpace);
            String word2 = sentence.substring(firstSpace + 1, lastSpace);
            String word3 = sentence.substring(lastSpace + 1);
            return word2 + " " + word3 + " " + word1;
            }
            return sentence;
        }
        
    //izakson's part: change the original vowels to signs.
    public static String getNewVowels(String sentence) {
            sentence = sentence.replace('u', '&');
            sentence = sentence.replace('o', '0');
            sentence = sentence.replace('i', '1');
            sentence = sentence.replace('e', '#');
            sentence = sentence.replace('a', '@');
            return sentence;
        }
    //izakson's part: change the signs to original vowels.
     public static String getOriginalVowels(String sentence) {
            sentence = sentence.replace('&', 'u');
            sentence = sentence.replace('0', 'o');
            sentence = sentence.replace('1', 'i');
            sentence = sentence.replace('#', 'e');
            sentence = sentence.replace('@', 'a');
            return sentence;
        
    }
}
  
