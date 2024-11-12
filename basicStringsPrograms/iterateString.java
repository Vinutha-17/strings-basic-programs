public class iterateString {
    
    static void iterate(String s){
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
            System.out.print(" ");
        }
    }

    public static void main(String[] args)
    {
        String s = "hello world";
        iterate(s);
    }
}
