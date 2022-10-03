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
    public void givenFirstname_WhenNotProper_ShouldReturn_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validFirstName("bridge");
        Assert.assertEquals(false, result);

    }
    @Test
    public void lastname_should_return_True() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validLastName("Labz");
        Assert.assertEquals(true,result);
    }
    @Test
    public void lastname_should_return_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validLastName("bridge");
        Assert.assertEquals(false,result);
    }
    @Test
    public void email_should_return_true() {
        UserRegistration userValidater = new UserRegistration();
        boolean result = userValidater.validEmail("bridge.labz@gmail.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void email_should_return_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validEmail("bridgelabz@.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void phone_should_return_True() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPhone("810045784123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void phone_should_return_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPhone("87415927187");
        Assert.assertEquals(false,result);
    }
    @Test
    public void password1_should_return_True()  {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPassword1("7845B22441");
        Assert.assertEquals(true,result);
    }
    @Test
    public void password1_should_return_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPassword1("785bridge");
        Assert.assertEquals(false,result);
    }

    @Test
    public void password3_should_return_True() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPassword3("abtsdA34");
        Assert.assertEquals(true,result);
    }
    @Test
    public void password3_should_return_False() {
        UserRegistration ur = new UserRegistration();
        boolean result = ur.validPassword3("78ufdye");
        Assert.assertEquals(false,result);
    }
}
