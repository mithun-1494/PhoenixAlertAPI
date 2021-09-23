package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Base.BaseUtil;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStep extends BaseUtil{

    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public User convert(Map<String, String> entry){
        return new User(
                entry.get("username"),
                entry.get("password").concat("$$$$$")
        );
    }


    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
//        BaseUtil.scenarioDef.createNode(new GherkinKeyword("Then"), "I should see the userform page");

        Assert.assertEquals("Its not displayed", true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
//    	scenarioDef.createNode( new GherkinKeyword("Given"), "I navigate to the login page");
        System.out.println("Navigate Login Page");
       
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
//        BaseUtil.scenarioDef.createNode(new GherkinKeyword("And"), "I click login button");
//        LoginPage page = new LoginPage(base.Driver);
//        page.ClickLogin();
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(List<User> table) throws Throwable {
//        BaseUtil.scenarioDef.createNode(new GherkinKeyword("And"), "I enter the following for login");
        //Create an ArrayList
        //List<User> users =  new ArrayList<User>();
        //Store all the users
        //List<User> users = table.asList(User.class);

//        LoginPage page = new LoginPage(base.Driver);

//        page.Login(table.get(0).username, table.get(0).password);
//        Thread.sleep(3000);
        //page.Login(users.get(2), users.get(3));

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
//        BaseUtil.scenarioDef.createNode(new GherkinKeyword("And"), "I enter username and password");
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @Then("^I should see the userform page wrongly$")
    public void iShouldSeeTheUserformPageWrongly() throws Throwable {
//        BaseUtil.scenarioDef.createNode(new GherkinKeyword("Then"), "I should see  the useform page wrongly");
        //Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("sdfgdsfsd")).isDisplayed(), true);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username= userName;
            password = passWord;
        }
    }

}