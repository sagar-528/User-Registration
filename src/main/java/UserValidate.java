import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate
{
    // Method for first name.
    public boolean firstName(String fName)
    {
        String patternFirstName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternFirstName);
        Matcher matcher = p.matcher(fName);
        return matcher.matches();
    }

    //Method for last name.
    public boolean lastName(String lName)
    {
        String patternLastName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternLastName);
        Matcher matcher = p.matcher(lName);
        return matcher.matches();
    }
}
