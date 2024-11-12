public class reverse3 {
        public static void main(String[] args)
        {
            //method 3 using character array
            String s = "abc";
            char[] res = s.toCharArray();
    
            for(int i=res.length-1; i>=0; i--){
                System.out.print(res[i]);
            }
    
        }
    }
    

