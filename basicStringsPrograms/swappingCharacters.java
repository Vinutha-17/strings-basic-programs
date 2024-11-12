public class swappingCharacters {
    
    public static String swapPair(String s)
    {
        if(s == null || s.isEmpty()) return s;

        char[] c = s.toCharArray();
        for(int i = 0; i < c.length-1; i+=2)
        {
            char temp = c[i];
            c[i] = c[i+1];
            c[i+1] = temp;
        }

        return new String(c);
    }

    public static void main(String[] args)
    {
        String s = "hello world";
        System.out.println(swapPair(s));
    }
}
