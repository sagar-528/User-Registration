import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
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
    public boolean emailId(String eId) {
        String patternemailId = "^[a-zA-Z]{1,}([.]?[-]?[+]?[a-zA-Z0-9]{1,})?[@]{1}[A-Za-z0-9]{1,}[.]{1}[a-zA-Z]{2,4}([.]?[A-Za-z]{2,4})?$";
        Pattern p = Pattern.compile(patternemailId);
        Matcher matcher = p.matcher(eId);
        return matcher.matches();
    }

    //Method for MobileNo.
    public boolean mobileNo(String mNumber) {
        String patternmobileNo = "^"+COUNTRY_CODE+"[][9876]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(patternmobileNo);
        Matcher matcher = p.matcher(mNumber);
        return matcher.matches();
    }

    //Method for Password Case.
    public boolean password8Character(String password)
    {
        String patternpassword8Character= "^.{8,}$";
        Pattern p = Pattern.compile(patternpassword8Character);
        Matcher matcher = p.matcher(password);
        return matcher.matches();
    }
}

