/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
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
    
    public static void main(String[] args){
        
        System.out.println("Welcome to the Encryption / Decryption Program");
        
    }
    
}
