import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Data_Test
{
    UserValidate validate = new UserValidate();

    // Test case for validating first name.
    @Test
    public void ProvideFirstName_WhenProper_ReturnTrue()
    {
        boolean result = validate.firstName("Pawan");
        Assert.assertEquals(true, result );
    }

    // Test case for validating last name.
    @Test
    public void ProvideLastName_WhenProper_ReturnTrue()
    {
        boolean result = validate.lastName("Gupta");
        Assert.assertEquals(true, result );
    }

    // Test case for validating email Id.
    @Test
    public void ProvideEmailId_WhenProper_ReturnTrue()
    {
        boolean result = validate.emailId("Gupta.sagar528@gmail.com");
        Assert.assertEquals(true, result );
    }
}