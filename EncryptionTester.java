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
   @Test
    public void testAdd(){
        
        String result = Encryption.getNewVowels("sentence");
        assertEquals("s#nt#nc#",result);
        
    }
    @Test
    public void testAdd1(){
        
        String result = Encryption.getNewVowels("my name is");
        assertEquals("my n@m# 1s",result);
        
    }
    @Test
    public void testAdd2(){
        
        String result = Encryption.getNewVowels("i should");
        assertEquals("1 sh0&ld",result);
        
    }
    @Test
    public void testAdd3(){
        
        String result = Encryption.getNewVowels("nevo");
        assertEquals("n#v0",result);
        
    }
    @Test
    public void testAdd4(){
        
        String result = Encryption.getNewVowels("shoham");
        assertEquals("sh0h@m",result);
        
    }
    @Test
    public void testAdd5(){
        
        String result = Encryption.getOriginalVowels("s#nt#nc#");
        assertEquals("sentence",result);
        
    }
    @Test
    public void testAdd6(){
        
        String result = Encryption.getOriginalVowels("my n@m# 1s");
        assertEquals("my name is",result);
        
    }
    @Test
    public void testAdd7(){
        
        String result = Encryption.getOriginalVowels("1 sh0&ld");
        assertEquals("i should",result);
        
    }
    @Test
    public void testAdd8(){
        
        String result = Encryption.getOriginalVowels("n#v0");
        assertEquals("nevo",result);
        
    }
    @Test
    public void testAdd9(){
        
        String result = Encryption.getOriginalVowels("sh0h@m");
        assertEquals("shoham",result);
        
    }
    
}
