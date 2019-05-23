package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fourth {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/Users/macstudent/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        
        WebDriverWait myWaitVar = new WebDriverWait(driver,10);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("u_0_c")).sendKeys("tutorial");
        
        System.out.println(alertMessage);
        //driver.quit();
       
    }
}