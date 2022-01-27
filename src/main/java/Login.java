import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--blink-settings=imagesEnabled=false");

        WebDriver webDriver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  /*      webDriver.get("https://petdog.ru/");

        webDriver.manage().window().setSize(new Dimension(1920, 1080));

        webDriver.findElement(By.xpath("//div[@id='sw_dropdown_878']/a/span")).click();

        By authFormLocator = By.xpath("//input[@id='login_popup878']");
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(authFormLocator));
        WebElement authForm = webDriver.findElement(authFormLocator);
        authForm.findElement(By.xpath("//div[@id='login_container']/div/input")).sendKeys("89969426796");
        authForm.findElement(By.xpath("//a[contains(text(),'Выслать код для входа')]")).click();
        authForm.findElement(By.xpath("//input[@id='code_popup878']")).sendKeys("87866");
        authForm.findElement(By.xpath("//a[contains(text(),'Войти в аккаунт')]")).click();

        webDriver.findElement(By.xpath("//span[contains(@class, 'ty-account-info__title-button-text')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'Выйти')]")).click();

        new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='sw_dropdown_878']/a/span")));
        webDriver.quit();
    } */

        webDriver.get("https://leonardo.ru/");

        webDriver.manage().window().setSize(new Dimension(1920, 1080));

        webDriver.findElement(By.xpath("//a[@class='header-links d-none d-md-flex']")).click();

        By authFormLocator = By.xpath("//div[@class='auth-wrapper d-flex flex-column flex-lg-row align-items-center align-items-lg-start']");
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(authFormLocator));
        WebElement authForm = webDriver.findElement(authFormLocator);
        authForm.findElement(By.xpath("//input[@placeholder='E-mail']")).sendKeys("karpenko0304@rambler.ru");
        authForm.findElement(By.xpath("//input[@placeholder='Пароль']")).sendKeys("qwert12345");
        authForm.findElement(By.xpath("//input[@class='general-btn enter-btn']")).click();

        webDriver.findElement(By.xpath("//a[@class='auth-exit profile-menu__link']")).click();

        new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='header-links d-none d-md-flex']")));
        webDriver.quit();
    }



}