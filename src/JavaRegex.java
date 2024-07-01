import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Sadikshya", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello Sadikshya!!!");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        } else{
            System.out.println("Match out found");
        }
    }
}
