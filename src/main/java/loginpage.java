import landing.landingpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/client/");
driver.manage().window().maximize();
landingpage lp=new landingpage(driver);
lp.goTo();
lp.loginApplication("abhijith2260883@gmail.com","jITHU_5288040");
Thread.sleep(2000);
lp.clickcartButton();
Thread.sleep(2000);
lp.clickcheckoutButtons();
Thread.sleep(2000);
lp.finalcheckoutButtons();
Thread.sleep(2000);
//driver.findElement(By.id("userEmail")).sendKeys("abhijith2260883@gmail.com");
//driver.findElement(By.id("userPassword")).sendKeys("jITHU_5288040");
//Thread.sleep(2000);
//driver.findElement(By.id("login")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector(".btn.w-10.rounded")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//ul//li[4]//button")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//ul//div//button[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div//select[1]//option[2]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div//select[1]//option[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div//select[2]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div//select[2]//option[22]")).click();
//Thread.sleep(2000);
//driver.findElement(By.name("CVV Code")).sendKeys("000");
//Thread.sleep(2000);


    }
}
