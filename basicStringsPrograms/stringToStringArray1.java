public class stringToStringArray1 {
    
    public static void main(String[] args)
    {
        String str = "hello my name is Vinutha";

        String strArray[] = str.split(" ");
        System.out.println("String :" + str);
        System.out.print("Arrays : [");
        for(int i = 0; i < strArray.length; i++)
        {
            System.out.print(strArray[i]+", ");
        }
        System.out.print("]");
    }
}
