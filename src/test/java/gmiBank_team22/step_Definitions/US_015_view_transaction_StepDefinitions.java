package gmiBank_team22.step_Definitions;

import gmiBank_team22.pages.BasePage;
import gmiBank_team22.pages.US_015_view_transaction_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_015_view_transaction_StepDefinitions {

    US_015_view_transaction_Page us_015_view_transaction_page = new US_015_view_transaction_Page();
    BasePage basePage = new BasePage();


    @When("click my operations")
    public void click_my_operations() {
        basePage.MyOperaion.click();
    }

    @When("click my accounts")
    public void click_my_accounts() {
        basePage.MyAccounts.click();
    }

    @Then("should be able to see balance")
    public void should_be_able_to_see_balance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("should be able to see account type")
    public void should_be_able_to_see_account_type() {

    }

    @When("click transaction")
    public void click_transaction() {

    }

    @Then("see transactions")
    public void see_transactions() {

    }


}
