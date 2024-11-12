public class reverse2 {

        public static void main(String[] args)
        {
            //method 2 using for loop
    
            String s="abc", res="";
            char c;
            for(int i=0; i<s.length(); i++){
                c = s.charAt(i);
                res = c+res;
            }
            System.out.println(res);
        }
    
}
