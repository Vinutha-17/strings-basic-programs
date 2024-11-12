import java.sql.Array;
import java.util.ArrayList;

public class practice {
    

    public static ArrayList<String> splitSubstring(String s){

        int i,j;
        int len = s.length();

        ArrayList<String> result = new ArrayList<String>();

        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                result.add(s.substring(i,j));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = new String("hello world");
        ArrayList<String> li = practice.splitSubstring(str);

        System.out.println(li);

        int count = 1;

        for (String i : li) {
            System.out.println("("+count+")"+ "\""+i+"\"");
            count++;
        }


    }
}
