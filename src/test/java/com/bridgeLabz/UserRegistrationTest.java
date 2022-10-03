package com.bridgeLabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstname_WhenProper_ShouldReturn_True() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validFirstName("Bridelabz");
        Assert.assertEquals(true, result);
    }
}
