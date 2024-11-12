import java.util.Arrays;

public class anagram {
    
    private static boolean  checkAnagram(char[] s, char[] t){

        int n1= s.length;
        int n2= t.length;

        if(n1!=n2){
            return false;
        }

        Arrays.sort(s);
        Arrays.sort(t);

        for(int i=0; i<n1; i++){
            if(s[i]!=t[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        char[] t = {'a', 'b', 'c', 'd', 'e'};

        boolean res = checkAnagram(s, t);
        if(res==true)
            System.out.println("the given string is anagram");
        else
            System.out.println("the given string is not anagram");
    }
}
