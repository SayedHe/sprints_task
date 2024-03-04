import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_search {

    /********Variables******/
    private WebDriver driver;

    /********Constructor******/
    public Product_search(WebDriver driver){
        this.driver = driver;
    }

    /********Actions******/
    public void searchProduct(String product) {
        WebElement search = driver.findElement(By.xpath("//input[@id='search_input']"));
        search.sendKeys(product, Keys.ENTER);
    }

    /********Assertion******/
}
