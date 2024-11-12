public class insertString {
    static void insertStr(String s, String t, int index){
        int len = s.length();
        String sb = new String();
        //s.insert(len, t);
        for (int i = 0; i<(len); i++){
            sb += s.charAt(i);
            if(i== index){
                for(int j = 0; j<t.length(); j++)
                    sb += t.charAt(j);
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args){
        String s = "hello world";
        //String t = " welcome to the world";
        String t = "hi ";
        //int n=s.length();
        insertStr(s, t,5);
    }
}
