import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate
{
    public boolean firstName(String fName)
    {
        String patternFirstName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternFirstName);
        Matcher matcher = p.matcher(fName);
        return matcher.matches();
    }
}
