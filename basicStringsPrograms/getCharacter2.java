public class getCharacter2 {
        private static char getChar(String s, int index) {
        return s.toCharArray()[index];
    }

    public static void main(String[] args) {
        String s = "Hello world!";
        int index = 7;

        char res = getChar(s, index);

        System.out.println(res);
    }
}
