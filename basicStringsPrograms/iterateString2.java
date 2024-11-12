import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class iterateString2 {
    
    static void getChar(String s){

        CharacterIterator c = new StringCharacterIterator(s);

        while(c.current() != CharacterIterator.DONE) {
            System.out.print(c.current());
            System.out.print(" ");
            c.next();
        }
    }

    public static void main(String[] args) 
    {
        String s = "Hello world";
        getChar(s);
    }
    
}
