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
        char [] meinArray = Text.toCharArray();
        //double Schluessel = Math.random();
        double Schluessel = 0.771;
        char [] meinNeuesArray = verschluesseln(Schluessel, meinArray);
        System.out.println(meinNeuesArray);
		System.out.println(Schluessel);
    }
    
      
        public char [] verschluesseln(double offset, char[] charArray) {
 
        char[] cryptArray = new char[charArray.length];
        // erstmal ein leeres Char Array erstellen
 
        for (int i = 0; i < charArray.length; i++) {
 
                    double verschiebung = (charArray[i] * offset);
                    // ursprüngliches Zeichen plus Offset
 
                    cryptArray[i] = (char) (verschiebung);
 
        }
        return(cryptArray);
        
        
    }
}
