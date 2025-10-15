package landing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
    WebDriver driver;

    public  landingpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client/");
    }
    @FindBy(id="userEmail")
    WebElement userEmail;
    @FindBy(id="userPassword")
    WebElement userPassword;
    @FindBy(id="login")
    WebElement login;
    public void loginApplication(String email,String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        login.click();
    }
    @FindBy(css =".btn.w-10.rounded")
    WebElement cart;

    public void clickcartButton(){
        cart.click();
    }
    @FindBy(xpath = "//ul//li[4]//button")
    WebElement checkout;
    public void clickcheckoutButtons(){
        checkout.click();
    }
    @FindBy(xpath = "//ul//div//button[1]")
    WebElement finalcheckout;
    public void finalcheckoutButton(){
        finalcheckout.click();
    }


}
