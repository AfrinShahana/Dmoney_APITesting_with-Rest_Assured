package test_runner;

import controller.User;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;

import java.io.IOException;

public class UserTestRunner extends Setup {
    User user;

    @Test(priority = 1, description = "Do login with invalid information")
    public void LoginWithInvalidInfo() throws IOException,  ConfigurationException {
        user = new User();
        user.LoginAPIWithInvalidinfo();
        Assert.assertTrue(user.getMessage().contains("User not found"));
    }

    @Test(priority = 2, description = "Do login with valid information")
    public void LoginWithValidInfo() throws IOException, ConfigurationException {
        user = new User();
        user.LoginAPIWithValidinfo();
        Assert.assertTrue(user.getMessage().contains("Login successfully"));
    }


    @Test(priority = 3, description = "Create user with valid information")
    public void CreateNewUser() throws IOException, ConfigurationException {
        user = new User();
        user.CreateUser();
        Assert.assertTrue(user.getMessage().contains("User created"));
    }


    @Test(priority = 5, description = "Create Agent with valid information")
    public void CreateNewAgent() throws IOException, ConfigurationException {
        user = new User();
        user.createAgent();
        Assert.assertTrue(user.getMessage().contains("User created"));
    }

    @Test(priority = 6)
    public void SeachingUserByInvalidPhoneNumber() throws IOException, ConfigurationException {
        user = new User();
        user.SearchUserByInvalidPhonenumber();
        Assert.assertTrue(user.getMessage().contains("User not found"));
    }

    @Test(priority = 7)
    public void SeachingUserByValidPhoneNumber() throws IOException, ConfigurationException {
        user = new User();
        user.SearchUserByValidPhonenumber();
        Assert.assertTrue(user.getMessage().contains("User found"));
    }

    @Test(priority = 8)
    public void SeachingAgentByInvalidPhoneNumber() throws IOException, ConfigurationException {
        user = new User();
        user.SearchingAgentByInvalidPhonenumber();
        Assert.assertTrue(user.getMessage().contains("User not found"));
    }

    @Test(priority = 9)
    public void SearchingAgentByValidPhonenumber()  throws IOException, ConfigurationException {
        user = new User();
        user. SearchAgentByValidPhonenumber() ;
        Assert.assertTrue(user.getMessage().contains("User found"));
    }



}
