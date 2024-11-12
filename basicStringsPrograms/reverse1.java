public class reverse1 {

    public static void main(String[] args)
    {
        //Method 1 using StringBuilder method
        //StringBuilder sb = new StringBuilder();
        //String s = "abc";
        //sb.append(s);
        //sb.reverse();

        //System.out.println(sb);

        //method 2 using for loop

        //String s="abc", res="";
        //char c;
        //for(int i=0; i<s.length(); i++){
        //    c = s.charAt(i);
        //    res = c+res;
        //}
        //System.out.println(res);

        //method 3 using character array
        //String s = "abc";
        //char[] res = s.toCharArray();
//
        //for(int i=res.length-1; i>=0; i--){
        //    System.out.print(res[i]);
        //}

        //method 4 using String Buffer method
        String s = "abc";
        StringBuffer res = new StringBuffer(s);
        res.reverse();
        System.out.println(res);

    }
}
