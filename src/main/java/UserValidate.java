import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate
{
    //CONSTANT
    String COUNTRY_CODE="91";

    // Method for first name.
    public boolean firstName(String fName) {
        String patternFirstName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternFirstName);
        Matcher matcher = p.matcher(fName);
        return matcher.matches();
    }

    //Method for last name.
    public boolean lastName(String lName) {
        String patternLastName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternLastName);
        Matcher matcher = p.matcher(lName);
        return matcher.matches();
    }

    //Method for Email-Id.
    public boolean emailId(String eId)
    {  
        String patternemailId = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" + "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
        Pattern p = Pattern.compile(patternemailId);
        Matcher matcher = p.matcher(eId);
        return matcher.matches();
    }

    //Method for MobileNo.
    public boolean mobileNo(String mNumber) {
        String patternmobileNo = "^"+COUNTRY_CODE+"[ ][987]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(patternmobileNo);
        Matcher matcher = p.matcher(mNumber);
        return matcher.matches();
    }

    //Method for Password First Case.
    public boolean password8Character(String password)
    {
        String patternpassword8Character= "^.{8,}$";
        Pattern p = Pattern.compile(patternpassword8Character);
        Matcher matcher = p.matcher(password);
        return matcher.matches();
    }

    //Method for Password of minimum Uppercase.
    public boolean passwordMinimumUpperCase(String password)
    {
        String patternpasswordMinimumUpperCase= "^[A-Z0-9a-z]*[A-Z][A-Z0-9a-z]*";
        Pattern p = Pattern.compile(patternpasswordMinimumUpperCase);
        Matcher matcher = p.matcher(password);
        return matcher.matches();
    }

    //Method for Password has one Numeric number.
    public boolean passwordAtleast1Numeric(String password)
    {
        String patternpasswordAtleast1Numeric= ".*[0-9].*";
        Pattern p = Pattern.compile(patternpasswordAtleast1Numeric);
        Matcher matcher = p.matcher(password);
        return matcher.matches();
    }

    //Method for Password has 1 special character.
    public boolean password1specialcharacter(String password)
    {
        String patternpassword1specialcharacter= "^(?=^\\w*\\W\\w*$)(?=.*\\d)(?=.*[A-Z]).{8,}$";
        Pattern p = Pattern.compile(patternpassword1specialcharacter);
        Matcher matcher = p.matcher(password);
        return matcher.matches();
    }
}

