
/**
 * Write a description of class Decrypt here.
 * 
 * @author TheTJ  
 * @version 0.1
 */
public class Decrypt
{
    


    public Decrypt(String Text)//, double Key)
    {
        System.out.println(Text);
        double Key=0.771;
        char [] myArray = Text.toCharArray();
        char [] myNewArray = decrypt(Key, meinArray);
        System.out.println(myNewArray);
        System.out.println(Key);
    }

   public char [] decrypt(double offset, char[] charArray) 
   {
       char[] encryptArray = new char[charArray.length];
       
       
       for (int i = 0; i < charArray.length; i++) 
       {
           double move = (charArray[i]/(double)offset);
           double move1 = Math.ceil(move);
           System.out.println(move1);
           encryptArray[i] = (char) (move1);
       }
      return(encryptArray);
   }
}
