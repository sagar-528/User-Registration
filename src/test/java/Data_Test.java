import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Data_Test
{
    UserValidate validate = new UserValidate();

    @Test
    public void ProvideFirstName_WhenProper_ReturnTrue()
    {
        boolean result = validate.firstName("Pawan");
        Assert.assertEquals(true, result );
    }
}