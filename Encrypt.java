import java.text.*;
import java.util.*;

/**
 * Write a description of class Verschlüsseln here.
 * 
 * @author TheTJ 
 * @version 0.1
 */
public class Encrypt
{
      
    public Encrypt(String Text)
    {
        System.out.println(Text);
        char [] myArray = Text.toCharArray();
        //double Key = Math.random();
        double Key = 0.771;
        char [] myNewArray = Encrypt(Key, myArray);
        System.out.println(myNewArray);
		System.out.println(Key);
    }
    
      
        public char [] encrypt(double offset, char[] charArray) {
 
        char[] cryptArray = new char[charArray.length];
             for (int i = 0; i < charArray.length; i++) {
 
                    double move = (charArray[i] * offset);
                    
 
                    cryptArray[i] = (char) (move);
 
        }
        return(cryptArray);
        
        
    }
}
