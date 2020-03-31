import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Data_Test
{
    UserValidate validate = new UserValidate();

    // Test case for validating first name.
    @Test
    public void Provide_FirstName_WhenProper_ReturnTrue()
    {
        boolean result = validate.firstName("Pawan");
        Assert.assertEquals(true, result );
    }

    // Test case for validating last name.
    @Test
    public void Provide_LastName_WhenProper_ReturnTrue()
    {
        boolean result = validate.lastName("Gupta");
        Assert.assertEquals(true, result );
    }

    // Test case for validating email Id.
    @Test
    public void Provide_EmailId_WhenProper_ReturnTrue()
    {
        boolean result = validate.emailId("Gupta.sagar528@gmail.com");
        Assert.assertEquals(true, result );
    }

    // Test case for validating Mobile Number.
    @Test
    public void Provide_mobileNo_WhenProper_ReturnTrue()
    {
        boolean result = validate.mobileNo("91 8411824245");
        Assert.assertEquals(true, result );
    }

    // Test case for validating Mobile Number.
    @Test
    public void Provide_password8Character_WhenProper_ReturnTrue()
    {
        boolean result = validate.password8Character("Qwerty111");
        Assert.assertEquals(true, result );
    }

    // Test case for validating Mobile Number.
    @Test
    public void Provide_passwordMinimumUpperCase_WhenProper_ReturnTrue()
    {
        boolean result = validate.passwordMinimumUpperCase("Querida");
        Assert.assertEquals(true, result );
    }
}