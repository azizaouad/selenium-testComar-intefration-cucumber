package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;

public class SearchSteps {

    private WebDriver driver;

    @Before
    public void Setupbrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users/Lenovo/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void CloseBrowser() {
        driver.quit();
    }

    @Given("visit the website {string}")
    public void visit_the_website(String url) {

        driver.get(url);

    }

    @When("click on {string}")
    public void click_on(String link) {
        driver.findElement(By.linkText(link)).click();

    }

    @Then("check if the word {string} is vivisible")
    public void check_if_the_word_is_vivisible(String texte) {
        Assert.assertTrue(texte + "existe sur la page",
                driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[1]/h1")).isDisplayed());

    }

    @When("write {string} in the input")
    public void write_in_the_input(String motCle) {
        driver.findElement(By.id("edit-searchmeta")).sendKeys(motCle);

    }

    @And("click on the button of research")
    public void click_on_the_button_of_research() {
        driver.findElement(By.id("edit-submit-actualites")).click();

    }

    @Then("check if this text {string} is visible")
    public void check_if_this_text_is_visible(String texte) {
        Assert.assertTrue("Search result not visible.", driver.findElement(By.linkText(texte)).isDisplayed());
    }
}
