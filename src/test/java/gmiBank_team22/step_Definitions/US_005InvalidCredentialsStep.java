package gmiBank_team22.step_Definitions;

import gmiBank_team22.pages.US_005_InvalidCredentialsPage;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class US_005InvalidCredentialsStep {

    US_005_InvalidCredentialsPage invalid = new US_005_InvalidCredentialsPage();

    @Given("User goes to Url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }

    @Then("User clicks menuIcon")
    public void user_clicks_menuIcon() {
        invalid.logInDropdownMenu.click();
    }

    @Then("User clicks signInButton")
    public void user_clicks_signInButton() {
        invalid.signInButton.click();
    }

    @And("User enters Invalid Username")
    public void userEntersInvalidUsername() throws InterruptedException {
        invalid.userName.sendKeys(ConfigurationReader.getProperty("InvalidUsername"));
        Thread.sleep(1000);
    }

    @And("User enters Valid Password")
    public void userEntersValidPassword() throws InterruptedException {
        invalid.passWord.sendKeys(ConfigurationReader.getProperty("ManagerPassword"));
        Thread.sleep(1000);
    }

    @Then("User Clicks signIn Option")
    public void userClicksSignInOption() {
        invalid.signIn.click();
    }


    @Then("User sees Failed Message")
    public void userSeesFailedMessage() {
        String actualResult = invalid.failedMessage.getText();
        String expectedResult = "Failed to sign in! Please check your credentials and try again.";
    }

    @And("User enters Valid Username")
    public void userEntersValidUsername() throws InterruptedException{
        invalid.userName.sendKeys(ConfigurationReader.getProperty("ManagerUsername"));
        Thread.sleep(1500);
    }

    @And("User enters InValid Password")
    public void userEntersInValidPassword()throws InterruptedException {
        invalid.passWord.sendKeys(ConfigurationReader.getProperty("InvalidPassword"));
        Thread.sleep(1500);
    }

    @And("User enters InValid Username")
    public void userEntersInValidUsername()throws InterruptedException {
        invalid.userName.sendKeys(ConfigurationReader.getProperty("InvalidUsername"));
        Thread.sleep(1500);
    }

    @And("User enters Invalid Password")
    public void userEntersInvalidPassword()throws InterruptedException {
        invalid.passWord.sendKeys(ConfigurationReader.getProperty("InvalidPassword"));
        Thread.sleep(1500);
    }

    @Then("User select and click did you forget option?")
    public void userSelectAndClickDidYouForgetOption()throws InterruptedException {
        Thread.sleep(2000);
    invalid.didYouForget.click();
    Thread.sleep(1000);
    }

    @And("Enter email that suscribed")
    public void enterEmailThatSuscribed()throws InterruptedException {
    invalid.email.sendKeys("123@gmail.com");
    Thread.sleep(1000);
    }

    @Then("User clicks reset password")
    public void userClicksResetPassword()throws InterruptedException {
        invalid.resetPassWord.click();
        Thread.sleep(1000);
    }

    @Then("Users clicks register option if thet do not yet registered")
    public void usersClicksRegisterOptionIfThetDoNotYetRegistered() {
    invalid.registerAccount.click();
    }

    @Then("User should see registration page")
    public void userShouldSeeRegistrationPage() {
        String actualResult=invalid.registerValidation.getText();
        String expectedResult="Registration";
        assertThat(actualResult,is(expectedResult));
    }


    //    @Given("User goes to Url")
//    public void user_goes_to_Url() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
//    }
//
//    @Given("click user icon")
//    public void click_user_icon() {
//        invalid.logInDropdownMenu.click();
//    }
//
//    @Given("click Sign in")
//    public void click_Sign_in() {
//        invalid.signInButton.click();
//    }
//
//    @Given("User enters invalid {string}")
//    public void user_enters_invalid(String string) {
//        invalid.userName.sendKeys("string");
//    }
//
//    @Then("User enters valid {string}")
//    public void user_enters_valid(String string) {
//        invalid.passWord.sendKeys("string");
//    }
//
//    @Then("User click Sign in Button")
//    public void user_click_Sign_in_Button() {
//        invalid.signIn.click();
//    }
//
//    @Then("User get Error Message and validate it")
//    public void user_get_Error_Message_and_validate_it()throws InterruptedException {
//    invalid.didYouForget.click();
//    Thread.sleep(2000);
//    }
//
// @Then("User enter email for reset password")
// public void userEnterEmailForResetPassword()throws InterruptedException {
//     invalid.email.sendKeys("123@gmail.com");
//     Thread.sleep(2000);
// }
//
//
//    @Then("User can reset password")
//    public void userCanResetPassword() {
//     invalid.resetPassWord.click();
//    }
//
//    @Then("page gives a statement to register it.")
//    public void pageGivesAStatementToRegisterIt() {
//     String actualResult=invalid.registerValidation.getText();
//     String expectedResult="Enter the email address you used to register";
//     assertThat(expectedResult,is(expectedResult));
//    }


}
