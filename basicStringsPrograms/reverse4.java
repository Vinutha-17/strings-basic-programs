public class reverse4 {
        public static void main(String[] args)
        {
            //method 4 using String Buffer method
            String s = "abc";
            StringBuffer res = new StringBuffer(s);
            res.reverse();
            System.out.println(res);
    
        }
    }