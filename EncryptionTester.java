import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
   //shoham/s part
   @Test
    public void testAdd(){
        
        int result = Encryption.countWords("hello world java");
        assertEquals(3,result);
        
    }
    @Test
    public void testAdd1(){
        
        int result = Encryption.countWords("ultras haifa");
        assertEquals(2,result);
        
    }
    @Test
    public void testAdd2(){
        
        int result = Encryption.countWords("givat shmuel");
        assertEquals(2,result);
        
    }
    @Test
    public void testAdd3(){
        
        int result = Encryption.countWords("maccabi");
        assertEquals(1,result);
        
    }
    @Test
    public void testAdd4(){
        
        int result = Encryption.countWords("shoham sapir");
        assertEquals(2,result);
        
    }
    @Test
    public void testAdd5(){
        
        String result = Encryption.shiftWordsRight("hello world java", 3);
        assertEquals("java hello world",result);
        
    }
    @Test
    public void testAdd6(){
        
        String result = Encryption.shiftWordsRight("hello world", 2);
        assertEquals("world hello",result);
        
    }
    @Test
    public void testAdd7(){
        
        String result = Encryption.shiftWordsRight("java", 1);
        assertEquals("java",result);
        
    }
    @Test
    public void testAdd8(){
        
        String result = Encryption.shiftWordsRight("maccabi haifa ultras", 3);
        assertEquals("ultras maccabi haifa",result);
        
    }
    @Test
    public void testAdd9(){
        
        String result = Encryption.shiftWordsRight("world", 1);
        assertEquals("world",result);
        
    }
    @Test
    public void testAdd10(){
        
        String result = Encryption.shiftWordsLeft("java hello world", 3);
        assertEquals("hello world java",result);
        
    }
     @Test
    public void testAdd11(){
        
        String result = Encryption.shiftWordsLeft("shoham sapir", 2);
        assertEquals("sapir shoham",result);
        
    }
     @Test
    public void testAdd12(){
        
        String result = Encryption.shiftWordsLeft("izakson noam", 2);
        assertEquals("noam izakson",result);
        
    }
     @Test
    public void testAdd13(){
        
        String result = Encryption.shiftWordsLeft("yarok ole", 2);
        assertEquals("ole yarok",result);
        
    }
     @Test
    public void testAdd14(){
        
        String result = Encryption.shiftWordsLeft("java", 1);
        assertEquals("java",result);
        
    }
   //izakson/s part
   @Test
    public void testAdd15(){
        
        String result = Encryption.getNewVowels("sentence");
        assertEquals("s#nt#nc#",result);
        
    }
    @Test
    public void testAdd16(){
        
        String result = Encryption.getNewVowels("my name is");
        assertEquals("my n@m# 1s",result);
        
    }
    @Test
    public void testAdd17(){
        
        String result = Encryption.getNewVowels("i should");
        assertEquals("1 sh0&ld",result);
        
    }
    @Test
    public void testAdd18(){
        
        String result = Encryption.getNewVowels("nevo");
        assertEquals("n#v0",result);
        
    }
    @Test
    public void testAdd19(){
        
        String result = Encryption.getNewVowels("shoham");
        assertEquals("sh0h@m",result);
        
    }
    @Test
    public void testAdd20(){
        
        String result = Encryption.getOriginalVowels("s#nt#nc#");
        assertEquals("sentence",result);
        
    }
    @Test
    public void testAdd21(){
        
        String result = Encryption.getOriginalVowels("my n@m# 1s");
        assertEquals("my name is",result);
        
    }
    @Test
    public void testAdd22(){
        
        String result = Encryption.getOriginalVowels("1 sh0&ld");
        assertEquals("i should",result);
        
    }
    @Test
    public void testAdd23(){
        
        String result = Encryption.getOriginalVowels("n#v0");
        assertEquals("nevo",result);
        
    }
    @Test
    public void testAdd24(){
        
        String result = Encryption.getOriginalVowels("sh0h@m");
        assertEquals("shoham",result);
        
    }
    
}
