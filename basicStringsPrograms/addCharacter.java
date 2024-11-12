public class addCharacter {
    
    static String addChar(String s, int pos, char c) {

        StringBuffer b = new StringBuffer(s);

        b.insert(pos, c);

        return b.toString();
    }

    public static void main(String[] args) {
        String s = "Hello world";

        char c = 's';

        int pos = s.length();
        String res = addChar(s, pos,c);

        System.out.println(res);
    }
}
