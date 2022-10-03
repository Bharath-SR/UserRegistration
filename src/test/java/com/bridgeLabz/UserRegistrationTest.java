package com.bridgeLabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void firstName_should_return_true() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validFirstName("Bridelabz");
        Assert.assertEquals(true, result);
    }
    @Test
    public void lastname_should_return_True() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validLastName("Labz");
        Assert.assertEquals(true,result);
    }
}
