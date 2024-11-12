public class stringPalindrome {
    static void Palindrome(String s){
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
            if(rev.equals(s))
            System.out.println("String is palindrome");
            else
            System.out.println("String is not palindrome");
    }

    public static void main(String[] args)
    {
        String a = "hello";
        String b = "aa bb aa";
        Palindrome(b);
        Palindrome(a);
    }
}
