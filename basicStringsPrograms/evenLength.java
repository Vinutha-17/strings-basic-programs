
public class evenLength
{
    static void evenPart(String s){
        for(String i : s.split(" ")){
            if(i.length()%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter string");
        //String str=in.nextLine();
        String str="Hi my name is Vinutha";
        evenPart(str);
    }
}